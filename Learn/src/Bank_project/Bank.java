package Bank_project;
import Bank_project.Account.Account;
import Bank_project.Account.SavingsAccount;

import java.util.*;


public class Bank {
    private final String name;
    private final List<User> users;
    private final List<Account> accounts;
    private final List<Transaction> transactionHistory;

    public Bank(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.transactionHistory = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }



    public void registerUser(User user) {
        users.add(user);
    }

    public void openAccount(User user, Account account){
        accounts.add(account);
        user.addAccount(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
        transactionHistory.add(new Transaction(account.getId(), TransactionType.DEPOSIT, amount));
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
        transactionHistory.add(new Transaction(account.getId(), TransactionType.WITHDRAW, amount));
    }

    public void applyInterest(SavingsAccount account) {
        double oldBalance = account.getBalance();
        account.applyInterest();
        double interestAmount = account.getBalance() - oldBalance;
        transactionHistory.add(new Transaction(account.getId(), TransactionType.INTEREST, interestAmount));
    }

    public void printAllAccounts() {
        System.out.println("=== Все счета банка " + name + " ===");
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    public void printTransactionHistory() {
        System.out.println("=== История транзакций ===");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }

    public void printUserAccounts(User user) {
        System.out.println("=== Счета пользователя " + user.getName() + " ===");
        for (Account a : user.getAccounts()) {
            System.out.println(a);
        }
    }


}
