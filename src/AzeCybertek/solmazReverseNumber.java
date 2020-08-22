package AzeCybertek;

public class solmazReverseNumber {

    public static void main(String[] args) {

        int num = 123; //321
        String  str = new StringBuffer(Integer.toString(num)).reverse().toString();
        num=Integer.parseInt(str);
        System.out.println(num);
    }
}
