package Edabit;

public class booleanBoth {
    public static boolean both(int n1, int n2) {
        if ((n1 == 0 && n2 == 0) || (n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(both(1,2));
    }
}
