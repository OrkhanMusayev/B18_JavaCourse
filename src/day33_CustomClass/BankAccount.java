package day33_CustomClass;

/**
 * practice task:
 * create a custom class for bank accountattrubutes:
 * accountholder, accountnumber, balanceactions:
 * cehckingBalance(), withDraw( amount ), deposit( amount )
 */

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;


    public void checkingBalance(){
        System.out.println("Available balance: "+ balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance-=amount; // when we withdrawing from ATM machine our balance is reduce
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount; // when we deposit our balance will increase
    }

    public String toString(){
        String result ="Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvailable Balance: "+balance;
        return result;
    }
}
