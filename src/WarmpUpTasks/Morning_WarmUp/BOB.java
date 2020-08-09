package WarmpUpTasks.Morning_WarmUp;

public class BOB {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Orkhan", "Musayev");

        account1.depositing(2000);
        account1.withdraw(500);
        System.out.println(account1);
    }
}
