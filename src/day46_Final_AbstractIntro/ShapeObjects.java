package day46_Final_AbstractIntro;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle obj1 = new Circle(3.5);
        obj1.Area();

        System.out.println("===============================");

        Square obj2 = new Square(2);
        obj2.Area();

        System.out.println("===============================");

        Rectangle obj3 = new Rectangle(2,3);
        obj3.Area();

        System.out.println("===============================");

        Triangle obj4 = new Triangle(5,5);
        obj4.Area();
    }
}
