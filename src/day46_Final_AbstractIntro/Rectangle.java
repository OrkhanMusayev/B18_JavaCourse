package day46_Final_AbstractIntro;
// Rectangle area = a * b
public class Rectangle extends shape{

    public double with;
    public double length;

    @Override
    public void Area(){
        double area = with * length;
        System.out.println("Area of rectangle: "+area);
    }

    public Rectangle(double with, double length){
        this.with = with;
        this.length = length;
    }
}
