package Codingbat;

public class erf {

    public static void main(String[] args) {

        int a = 200;
        int b = -a++  - --a * a-- % 2;
          //    -200  - 200 * 200 % 2
          //
        System.out.println(b);
    }
}
