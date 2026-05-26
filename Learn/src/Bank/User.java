package Bank;

import Bank.Account.Account;

import java.util.*;

public class User {

    private int id;
    private String name;
    private List<Account> accounts;

    public User(int id, String name){
        this.id = id;
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public double getTotalBalance(){
        double sum = 0;
        for (Account a : accounts){
            sum+= a.getBalance();
        }
        return sum;
    }

    @Override
    public String toString(){
        return "Пользователь #" + id + ", " + name + ", счетов: " + accounts.size() + ", общий баланс: " + getTotalBalance();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
