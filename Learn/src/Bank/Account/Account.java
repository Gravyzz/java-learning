package Bank.Account;

import java.util.Objects;

public abstract class Account {
    
    protected int id;
    protected double balance;
    protected String ownerName;
    
    public Account(int id, String ownerName){
        this.id = id;
        this.ownerName = ownerName;
        this.balance = 0;
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
        this.balance +=amount;
    }

    abstract void withdraw(double amount);

    abstract String getAccountType();

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
