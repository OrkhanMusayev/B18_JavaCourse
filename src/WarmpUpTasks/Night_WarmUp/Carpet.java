package WarmpUpTasks.Night_WarmUp;
/**
create a custom class for the carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width+length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice

 */

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double w,double l,double unit,boolean isPersian){
        width=w;
        length=l;
        unitPrice=unit;
    }

    public double calcCost(){

        if(isPersian){
            return (width+length)*unitPrice+200;
        }
        return (width+length)*unitPrice;
    }

    public String toString(){
        return "Width of carpet is: "+width+", \nLength of carpet is: "+length+", \nTotal Price is: $"+calcCost();
    }



}
