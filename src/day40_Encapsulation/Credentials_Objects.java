package day40_Encapsulation;

public class Credentials_Objects {

    public static void main(String[] args) {

        Credentials facebook = new Credentials();

        System.out.println( facebook.getUserName() );// null : we have not set them yet
        System.out.println( facebook.getPassWord() );// null : we have not set them yet

        // to set UserName and PassWord => we use setter method to set private variables:

        facebook.setUserName("orkhanmusayev");
        facebook.setPassWord("123456");

        // Now if we try to print them using the getter method ==> it will return us the values:

        System.out.println(facebook.getUserName()); // orkhanmusayev
        System.out.println(facebook.getPassWord()); // 123456


    }
}
