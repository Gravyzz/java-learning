package Bank.Account;

import Bank.Exception.CreditLimitExceededException;
import Bank.Exception.InvalidAmountException;

public class CreditAccount extends Account{

    private double creditLimit;
    public CreditAccount(int id, String ownerName, double creditLimit){
        super(id, ownerName);
        this.creditLimit =creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String getAccountType(){
        return "Кредитный";
    }

    @Override
    public void withdraw(double amount){
        if (amount <=0){
            throw new InvalidAmountException("Сумма должна быть положительной: " + amount);
        }
        if ((balance-amount) >= -creditLimit){
            balance-=amount;
        } else{
            throw new CreditLimitExceededException("Превышен кредитный лимит на счёте #" + id);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", лимит: " + creditLimit;
    }
}
