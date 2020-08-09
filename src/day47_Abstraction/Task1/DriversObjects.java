package day47_Abstraction.Task1;

public class DriversObjects {

    public static void main(String[] args) {


        String URL = "https://www.google.com";
        ChromeDriver obj1 = new ChromeDriver();
        obj1.get(URL);
        obj1.quit();

        System.out.println("=================================");

        FireFoxDriver obj2 = new FireFoxDriver();
        obj2.get(URL);
        obj2.quit();

        System.out.println("=================================");

        OperaDriver obj3 = new OperaDriver();
        obj3.get(URL);
        obj3.quit();

        System.out.println("=================================");

        EdgeDriver obj4 = new EdgeDriver();
        obj4.get(URL);
        obj4.quit();

        System.out.println("=================================");

        Safari obj5 = new Safari();
        obj5.get(URL);
        obj5.quit();

        System.out.println("=================================");

        IE obj6 = new IE();
        obj6.get(URL);
        obj6.quit();
    }
}
