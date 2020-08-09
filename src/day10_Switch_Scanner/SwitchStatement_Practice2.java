package day10_Switch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {

        int num = 5; //3

        switch(1){
            case 1:
                num += 3;
                break;// if remove break it will 3+2=5.

            case 2:
                num += 2;
                break;// if remove break it will 3+2+10=15

            case 3:
                num += 10;
                break;//if remove break it will 3+2+10-5=10

            default:
                num -= 5;
                break;


        }


        System.out.println(num);


    }

}
