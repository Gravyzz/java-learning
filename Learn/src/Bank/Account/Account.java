package Bank.Account;

import Bank.Exception.InsufficientFundsException;
import Bank.Exception.InvalidAmountException;

import java.util.Objects;

public abstract class Account {

    public static final int MAX_ACCOUNTS = 1000;
    protected int id;
    protected double balance;
    protected String ownerName;
    private static int totalAccountsCreated;

    public Account(int id, String ownerName){
        this.id = id;
        this.ownerName = ownerName;
        this.balance = 0;
        totalAccountsCreated++;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount){
        if (amount <=0){
            throw new InvalidAmountException("Сумма должна быть положительной: " + amount);
        }
        this.balance +=amount;
    }

    public abstract void withdraw(double amount);

    public abstract String getAccountType();

    protected void withdrawWithoutOverdraft(double amount) {
        if (amount <= 0){ throw new InvalidAmountException("Сумма должна быть положительной:" + amount);}
        if (amount > balance){ throw new InsufficientFundsException(id, amount, balance);
        } else {balance-=amount;}
    }


    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }

    @Override
    public String toString(){
        return "Счёт #" +this.id +", " + this.ownerName+", Тип: " + getAccountType()+", баланс: " + this.balance;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return getId() == account.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
