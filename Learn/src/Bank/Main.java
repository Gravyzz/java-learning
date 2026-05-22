package Bank;

import Bank.Account.DebitAccount;

public class Main {
    static void main(String[] args) {
        DebitAccount debitAccount0 = new DebitAccount(0,"Thomas");
        DebitAccount debitAccount1 = new DebitAccount(1,"Andrey");

        debitAccount0.deposit(1000);
        debitAccount1.deposit(500);
        debitAccount0.withdraw(300);
        debitAccount1.withdraw(700);

        System.out.println(debitAccount0);
        System.out.println(debitAccount1);

        DebitAccount debitAccount2 = new DebitAccount(0,"Nick");
        System.out.println("Equals: " + debitAccount0.equals(debitAccount2));
        System.out.println("==: " + (debitAccount0 == debitAccount2));
    }

}
