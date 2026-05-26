package Bank;

import Bank.Account.Account;
import Bank.Account.CreditAccount;
import Bank.Account.DebitAccount;
import Bank.Account.SavingsAccount;
import Bank.Exception.CreditLimitExceededException;
import Bank.Exception.InsufficientFundsException;
import Bank.Exception.InvalidAmountException;

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
    }
}