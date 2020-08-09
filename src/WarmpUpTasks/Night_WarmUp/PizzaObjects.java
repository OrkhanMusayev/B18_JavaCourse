package WarmpUpTasks.Night_WarmUp;

public class PizzaObjects {

    public static void main(String[] args) {

        Pizza first = new Pizza();
        first.customizeOrder("small",1,2);
        first.calCost();
        System.out.println(first);

    }
}
