package Bank.Account;

public class DebitAccount extends  Account{

    public DebitAccount(int id, String ownerName){
        super(id, ownerName);
    }

    @Override
    public String getAccountType(){
        return "дебетовый";
    }

    @Override
    public void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Недостаточно средств на счёте #"+id);
        } else{
            balance-=amount;
        }

    }
}
