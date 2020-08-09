package Codingbat;

public class sdjchbsd {

    public static void main(String[] args) {

        String str = "101sda1500aw1wq24";
        int sum = 0;
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                word += str.charAt(i);

                if (i==str.length()-1 || !Character.isDigit(str.charAt(i+1))) {
                    sum += Integer.parseInt(word);
                    word="";

                }
            }

        }

        System.out.println(sum);
    }
}
