package day41_Inheritance.Task2;

public class AccountObjects {


    public static void main(String[] args) {

        // here we will test our classes by creating objects
        CheckingAccount checking = new CheckingAccount();

        checking.accountHolder = "Amar";
        checking.showBalance();
        System.out.println(checking);

        checking.deposit(25000);
        checking.showBalance();
        System.out.println(checking);

        checking.withDraw(10000);
        checking.showBalance();

        System.out.println("================================================");


        SavingAccount saving = new SavingAccount();

        saving.accountHolder = "Aisha";

        System.out.println(saving.interestRate);
        System.out.println(saving);

        saving.deposit(10000);
        saving.showBalance();
        System.out.println(saving);
    }
}
