package WarmpUpTasks;

public class reverse_04_02_2020 {

    public static void main(String[] args) {


        String str = "Java";  //avaJ
        //    0123

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        String reverse2 = str.substring(3) +str.substring(2, 3) + str.substring(1,2) +str.substring(0,1);

        System.out.println(reverse1);
        System.out.println( reverse2);
    }





    }

