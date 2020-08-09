package day41_Inheritance.Task2;

/**
 * create sub class of BankAccount and name it SavingAccount
 * 			variables: accountNumber, accountHolder, balance, interestRate
 * 			methods: deposit, showBalance
 */
public class SavingAccount extends BankAccount {

    /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    Balance       (Inherited)

    interestRate (Declared)

    deposit (Inherited)
    showBalance (Inherited)
    toString() (Inherited)
     */


    // I need to declare this variable here: static because it is the same
    public static double interestRate;

    // because it is static: I can assign it (initialize it ) in a static block

    static {

        interestRate = 0.02;
    }


}
