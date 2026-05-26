package Bank_project;

import Bank_project.Account.Account;
import Bank_project.Account.CreditAccount;
import Bank_project.Account.DebitAccount;
import Bank_project.Account.SavingsAccount;
import Bank_project.Exception.CreditLimitExceededException;
import Bank_project.Exception.InsufficientFundsException;
import Bank_project.Exception.InvalidAmountException;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== БЛОК 1: Успешные операции ===");
        DebitAccount debit = new DebitAccount(1, "Thomas");
        debit.deposit(1000);
        debit.withdraw(300);
        System.out.println("Баланс Thomas: " + debit.getBalance());
        // Ожидаем: 700.0


        System.out.println("\n=== БЛОК 2: InvalidAmountException на deposit ===");
        try {
            debit.deposit(-500);
            System.out.println("Этого не должно быть напечатано");
        } catch (InvalidAmountException e) {
            System.out.println("Поймали: " + e.getMessage());
        }


        System.out.println("\n=== БЛОК 3: InvalidAmountException на withdraw с нулём ===");
        try {
            debit.withdraw(0);
            System.out.println("Этого не должно быть напечатано");
        } catch (InvalidAmountException e) {
            System.out.println("Поймали: " + e.getMessage());
        }


        System.out.println("\n=== БЛОК 4: InsufficientFundsException с использованием геттеров ===");
        // У debit баланс 700, пытаемся снять 1000
        try {
            debit.withdraw(1000);
            System.out.println("Этого не должно быть напечатано");
        } catch (InsufficientFundsException e) {
            System.out.println("Поймали: " + e.getMessage());
            System.out.println("  ID счёта: " + e.getAccountId());
            System.out.println("  Запрошено: " + e.getRequestedAmount());
            System.out.println("  Доступно: " + e.getAvailableBalance());
            System.out.println("  Не хватает: " + (e.getRequestedAmount() - e.getAvailableBalance()));
        }


        System.out.println("\n=== БЛОК 5: CreditLimitExceededException ===");
        CreditAccount credit = new CreditAccount(10, "Sergey", 5000);
        credit.deposit(1000);          // баланс: 1000
        credit.withdraw(3000);         // баланс: -2000 (в рамках лимита)
        System.out.println("Баланс Sergey после двух операций: " + credit.getBalance());
        // Ожидаем: -2000.0
        try {
            credit.withdraw(5000);     // попытка уйти до -7000, при лимите 5000
            System.out.println("Этого не должно быть напечатано");
        } catch (CreditLimitExceededException e) {
            System.out.println("Поймали: " + e.getMessage());
        }
        System.out.println("Баланс не изменился: " + credit.getBalance());
        // Ожидаем: -2000.0 (важно, что баланс не поменялся при провальной операции!)


        System.out.println("\n=== БЛОК 6: Полиморфизм исключений ===");
        // Один catch на RuntimeException ловит и InvalidAmount, и InsufficientFunds
        Account[] accounts = { debit, credit };
        for (Account acc : accounts) {
            try {
                acc.withdraw(-100);   // отрицательная сумма → InvalidAmountException
            } catch (RuntimeException e) {
                System.out.println("Тип: " + e.getClass().getSimpleName()
                        + ", сообщение: " + e.getMessage());
            }
        }


        System.out.println("\n=== БЛОК 7: SavingsAccount + applyInterest ===");
        SavingsAccount savings = new SavingsAccount(20, "Anna", 10.0);
        savings.deposit(1000);
        savings.applyInterest();       // +10%
        System.out.println("Баланс Anna: " + savings.getBalance());
        // Ожидаем: 1100.0
        try {
            savings.withdraw(5000);    // больше, чем есть
        } catch (InsufficientFundsException e) {
            System.out.println("Поймали InsufficientFunds на накопительном:");
            System.out.println("  Запрошено: " + e.getRequestedAmount()
                    + ", доступно: " + e.getAvailableBalance());
        }


        System.out.println("\n=== БЛОК 8: Статический счётчик ===");
        System.out.println("Всего создано счетов: " + Account.getTotalAccountsCreated());
        // Ожидаем: 3 (debit, credit, savings)
        System.out.println("Лимит счетов: " + Account.MAX_ACCOUNTS);
        // Ожидаем: 1000


        System.out.println("\n=== БЛОК 9: User и его счета ===");
        User ivan = new User(100, "Ivan");
        ivan.addAccount(debit);
        ivan.addAccount(credit);
        ivan.addAccount(savings);

        System.out.println(ivan);
        System.out.println("Общий баланс: " + ivan.getTotalBalance());

        System.out.println("\n=== БЛОК 10: Тест Transaction и TransactionType ===");
        Transaction t1 = new Transaction(1, TransactionType.DEPOSIT, 1000);
        Transaction t2 = new Transaction(1, TransactionType.WITHDRAW, 300);
        Transaction t3 = new Transaction(20, TransactionType.INTEREST, 100);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

// Демонстрация что у enum есть оба представления
        System.out.println("\nИмя enum: " + t1.getType().name());
        System.out.println("Описание: " + t1.getType().getDescription());


        System.out.println("\n=== БЛОК 11: Главный тест банка ===");
        Bank tinkoff = new Bank("Тинькофф");

        User petya = new User(1, "Петя");
        User vasya = new User(2, "Вася");

        tinkoff.registerUser(petya);
        tinkoff.registerUser(vasya);

        DebitAccount petyaDebit = new DebitAccount(1001, "Петя");
        SavingsAccount petyaSavings = new SavingsAccount(1002, "Петя", 5.0);
        CreditAccount vasyaCredit = new CreditAccount(2001, "Вася", 10000);

        tinkoff.openAccount(petya, petyaDebit);
        tinkoff.openAccount(petya, petyaSavings);
        tinkoff.openAccount(vasya, vasyaCredit);

// Операции через банк
        tinkoff.deposit(petyaDebit, 5000);
        tinkoff.withdraw(petyaDebit, 1000);
        tinkoff.deposit(petyaSavings, 10000);
        tinkoff.applyInterest(petyaSavings);
        tinkoff.deposit(vasyaCredit, 2000);
        tinkoff.withdraw(vasyaCredit, 5000);   // уйдёт в минус, кредитный пустит

// Попытка снять больше, чем есть на дебетовом — упадёт, в историю не запишется
        try {
            tinkoff.withdraw(petyaDebit, 100000);
        } catch (RuntimeException e) {
            System.out.println("⚠️ Не удалось: " + e.getMessage());
        }

        tinkoff.printAllAccounts();
        System.out.println();
        tinkoff.printUserAccounts(petya);
        System.out.println();
        tinkoff.printTransactionHistory();
    }
}