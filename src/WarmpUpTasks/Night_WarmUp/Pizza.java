package WarmpUpTasks.Night_WarmUp;
/**
 create a custom class for pizza that should contain the following:
            instance variables:
                  size (either small, medium, large)
                  number of cheese topping
                  number of pepperoni toppings
            instance method:
                  customizeOrder(): allows user to set the size and toppisngs of the pizza
                  calcCost(): returns the total cost as double
                  toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
            Pizza cost is determined by:
                  Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                  Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                  Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
 */

public class Pizza {

    String size;
    int numOfCheese;
    int numOfPepperoni;

    public void customizeOrder(String pizzaSize,int pizzaCheese,int pizzaPepperoni){
        size=pizzaSize;
        numOfCheese=pizzaCheese;
        numOfPepperoni=pizzaPepperoni;
    }

    public double calCost(){
        double sum=0;
        if(size.equalsIgnoreCase("Small")){
            sum+=10;
        }else if(size.equalsIgnoreCase("Medium")){
            sum+=12;
        }else if(size.equalsIgnoreCase("Large")){
            sum+=14;
        }
        sum+=numOfCheese*1;
        sum+=numOfPepperoni*1.5;
        return sum;
    }

    public String toString(){
        String result = "Pizza size is: "+size+"\n Pepperoni: "+numOfPepperoni+"\n Cheese: "+numOfCheese+"\n Your total is: $"+calCost();
        return result;
    }
}
