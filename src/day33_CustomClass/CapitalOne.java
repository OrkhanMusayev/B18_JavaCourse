package day33_CustomClass;

import com.sun.org.apache.xpath.internal.operations.Or;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Orkhan = new BankAccount();
        Orkhan.accountHolder = "Orkhan";
        Orkhan.accountNumber = 123456;
        Orkhan.checkingBalance(); // now balance is 0.00

        Orkhan.deposit(1000);
        Orkhan.checkingBalance(); // 1000.0

        Orkhan.withDraw(900);
        Orkhan.checkingBalance();

        Orkhan.withDraw(110);
        Orkhan.checkingBalance();

        Orkhan.withDraw(1000);
        Orkhan.checkingBalance();

        System.out.println("==========================================================================");

        System.out.println(Orkhan);






    }
}
