package day33_CustomClass;

public class AccountHolder {

    public static void main(String[] args) {

        BankAccount2 accountHolder = new BankAccount2();

        accountHolder.setAccountInfo("Orkhan Musayev",987456,2000);
        System.out.println(accountHolder);

        System.out.println("=======================================================================");

        accountHolder.deposit(500);

        System.out.println("=======================================================================");

        accountHolder.withdraw(1500);

        System.out.println("=======================================================================");

        accountHolder.withdraw(1500);

        System.out.println("=======================================================================");

        accountHolder.checkBalance();

    }
}
