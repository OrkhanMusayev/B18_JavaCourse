package day41_Inheritance.Task2;

/**
 * create sub class of BankAccount and name it checkingAccount
 * 			variables: accountNumber, accountHolder, balance
 * 			methods: deposit, withDraw, showBalance
 */
public class CheckingAccount extends BankAccount {


     /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    Balance       (Inherited)

    withDraw (Declared)

    deposit (Inherited)
    showBalance (Inherited)
    toString() (Inherited)
     */

     public void withDraw(int amount){
         balance -= amount;

         // This method must be instance (not static) because we are using the instance variable balance in it
         // variable balance is inherited from Bank Account : it was declared instance variable
     }
}
