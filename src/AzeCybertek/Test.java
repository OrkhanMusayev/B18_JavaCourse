package AzeCybertek;

public class Test {

    Test(int a, int b) {
        System.out.println("a = "+a+" b = "+b);  // a=10
    }
    Test(int a, byte b) {
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main (String args[]) {
        byte a = 10;
        byte b = 15;
        Test test = new Test(a,b);

    }
}
