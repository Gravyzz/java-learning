package Bank_project.Account;

public class DebitAccount extends  Account{

    public DebitAccount(int id, String ownerName){
        super(id, ownerName);
    }

    @Override
    public String getAccountType(){
        return "Дебетовый";
    }

    @Override
    public void withdraw(double amount) {
        withdrawWithoutOverdraft(amount);
    }
}
