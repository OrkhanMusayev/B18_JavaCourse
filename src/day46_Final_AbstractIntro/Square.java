package day46_Final_AbstractIntro;

public class Square extends shape{

    public double side;

    public Square(double side){
        this.side = side;
    }

    public void Area(){
        double area = side * side;
        System.out.println("Area of square : "+area);
    }
}
