package day46_Final_AbstractIntro;
// Triangle area = b * h * 1/2
public class Triangle {

    public double base;
    public double height;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void Area() {
        double area = height * base * 0.5;

        System.out.println("Area of the Triangle: " + area);

    }
}