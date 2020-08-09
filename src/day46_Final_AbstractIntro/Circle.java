package day46_Final_AbstractIntro;

public final class Circle extends shape{

    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;

    }

    @Override
    public void Area(){

        double area = radius * radius * PI;
        System.out.println("Area of circle : "+area);
    }
}
