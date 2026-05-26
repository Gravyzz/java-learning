package Bank_project.Account;

public class SavingsAccount extends Account{

    private double interestRate;
    public SavingsAccount(int id, String ownerName, double interestRate){
        super(id, ownerName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String getAccountType(){
        return "Накопительный";
    }

    @Override
    public void withdraw(double amount) {
        withdrawWithoutOverdraft(amount);
    }

    public void applyInterest(){
        balance *= (1 + interestRate / 100);
    }

    @Override
    public String toString(){
        return super.toString() + ", ставка: " + interestRate + "%";
    }
}
