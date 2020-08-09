package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create a class called ShoppingList
 *                 create 5 objects of Item and store them into List of Items
 *                 calculate the total cost of all Items in the list
 */

public class ShoppingList {

    public static void main(String[] args) {

       // Item item1 = new Item(); not Existing constructor
       //   Item item1 = new Item(2.5);

        Item item1 = new Item("Toilet Paper", 25,100);
        Item item2 = new Item("Milk", 1,5);
        Item item3 = new Item("Cheese", 2,4);
        Item item4 = new Item("Bananas", 0.50,10);
        Item item5 = new Item("Tomatoes", 0.75,8);

        //System.out.println(item1.calcCost()); // return total price
       // System.out.println(item1); // prints toString method

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList( item1,item2,item3,item4,item5 ) );

        double totalCost = 0;
/*
FIRST WAY WITH FOR EACH LOOP

        for(Item eachItem : shoppingList){ // eachItem: item1,item2,item3,item4,item5
            totalCost += eachItem.calcCost();
        }


 */
// SECOND WAY WITH FOR LOOP

       for(int i = 0; i <= shoppingList.size()-1; i++){
           totalCost += shoppingList.get(i).calcCost();
       }
        System.out.println("Total: "+totalCost);

    }

}
