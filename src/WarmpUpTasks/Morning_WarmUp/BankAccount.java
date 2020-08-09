package WarmpUpTasks.Morning_WarmUp;

/**
 * WarmUp tasks:
 * 	create costum class called BankAccount for Bank of America' bank accounts:
 * 			public variables:  bankName, firstName, lastName
 * 	 		private variables: accountHolder, accountNumber, balance
 * 	 		encapsulate all the private data
 * 	 				(DO NOT USE SHORTCUT)
 * 	 		create a constructor that can initialize firstName and fullName
 * 	 				(DO NOT USE SHORTCUT)
 * 	 		action:
 * 	 				depositing
 * 	 				withdrawing
 * 	 				availablebalance
 * 	 				toString: returns the full name and balance
 */
public class BankAccount {

    public static String bankName = "Bank of America";
    String firstName;
    String lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;


    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double depositing(double amount){
        return balance+=amount;
    }

    public double withdraw(double value){
        return balance-=value;
    }

    public double availableBalance(){
        return balance;
    }

    public String toString(){
        return "Full name: "+firstName+" "+lastName+"\nAvailable balance is: $"+balance;
    }

}
