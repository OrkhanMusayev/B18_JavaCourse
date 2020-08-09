package day41_Inheritance;


public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount orkhan = new BankAccount("Orkhan", "Musayev");

        // how can I print this private data: I can use getter
        System.out.println(orkhan.getAccountHolder()); //Irina Li

        // How can read balance : it's private==> through getter
        System.out.println(orkhan.getBalance());// now it's 0.0

        // to check balance:
        orkhan.checkBalance();

        // can I deposit some money? yes be calling deposit action and pass amount
        orkhan.depositing(120);

        // now iif I call check balance:
        orkhan.checkBalance(); // "Available Balance: $120.00"

        // Now I want to withdraw:
        orkhan.withdrawing(80);
        // balance
        orkhan.checkBalance(); // "Available Balance: $40"

        // if I want to print all info :
        System.out.println(orkhan); //Full Name: Irina Li, Available Balance: $40.0

    }
}
