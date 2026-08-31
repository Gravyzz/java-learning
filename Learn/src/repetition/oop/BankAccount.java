package repetition.oop;

public class BankAccount {

    private int balance;
    private static int createdAccounts;

    public BankAccount(int initialBalance){
        if (initialBalance < 0) throw new IllegalArgumentException("Баланс не может быть отрицательным");
        this.balance = initialBalance;
        createdAccounts++;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount <=0) throw new IllegalArgumentException("Cумма не может быть меньше 1");
        balance+=amount;
    }

    public boolean withdraw(int amount){
        if (amount <=0) throw new IllegalArgumentException("Сумма не может быть меньше 1");
        if (balance >= amount){
            balance-=amount;
            return true;
        }
        return false;
    }

    public static int getCreatedAccounts(){
        return createdAccounts;
    }

}
