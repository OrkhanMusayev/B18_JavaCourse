package day41_Inheritance;


 /**
 *     title
 *     author
 *     price
 *      */

public class Book {

     // we give public access modifier so we can use variables everywhere

     public String title;
    public String author;
    public double price;


     //we will create toString() method here ==> will be inherited in EBook and in AudioBook
    public String toString(){

        return "Title: "+title+", Author: "+ author+", $"+price;
    }
}
