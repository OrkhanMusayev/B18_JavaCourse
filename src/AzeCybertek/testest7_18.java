package AzeCybertek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testest7_18 {

    public static void main(String[] args) {

//        String str = "Java Java Java";
//        String target ="Java";
//
//        String [] arr = str.split(" ");
//        int count=0;
//        for (int i=0; i<arr.length; i++){
//            if(arr[i].equals(target)){
//                count++;
//            }
//        }
//        System.out.println(count);

//        int a = 0;
//        int b = 1;
//        int sum[] = new int[9]; // niye 9?
//        for (int i = 1; i < sum.length; i++) {
//            sum[i] = a + b;
//            a = b;
//            b = sum[i];
//        }
//        System.out.println(Arrays.toString(sum));

//        String str= "ABACBB"; // outpu: ABC
//
//        String result="";
//
//        for (int i=0; i<str.length();i++){
//            if (!result.contains(""+str.charAt(i))){
//                result+=""+str.charAt(i);
//            }
//        }
//        System.out.println(result);

//        int[] arrr = {10,20,7, 8, 90};
//        ArrayList<Integer> list= new ArrayList<>();
//        for(int i=0; i<arrr.length; i++) {
//            list.add(arrr[i]);
//        }
//        System.out.println(list);
//        System.out.println(Arrays.toString(arrr));
//        for(int i=0; i<arrr.length; i++) {
//            arrr[i]= max(list); //90
//            list.remove(Integer.valueOf(arrr[i]));
//        }
//        System.out.println(Arrays.toString(arrr));
//        System.out.println(list);
//    }
//    public static int max(ArrayList<Integer> list) {
//        int Max=Integer.MIN_VALUE; //-2147483648
//        for(int i=0; i<list.size();i++) {
//            if(Max< list.get(i)) {
//                Max=Math.max(Max, list.get(i));
//            }
//        }
//        return Max;

        String s="1a2b3c4f!@#";
        int sum=0;
        String letter="";
        String digit="";
        String sign="";
//        output
//     sum of  int  numbers > 10
//                           a b c f
//                             1 2 3 4
//                             !@#


/*
write a program that can return the second max
object from the arraylist
 */
//        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,8));
//        int j = Collections.max(list);
//
//        System.out.println("Max in the array is " + j);
//        list.remove(list.indexOf(j));
//        int max2 = Collections.max(list);
//        System.out.println(max2 );

//        //Reverse(“ABCD”); ==> DCBA
//        String string="ABCD";
//        String reverse = new StringBuffer(string).reverse().toString();
//        System.out.println(reverse);

        String str = "apple";  //aPpLe
                //    01234
        String result="";
        //System.out.println("a"+str.substring(1,2).toUpperCase()+"p"+str.substring(3,4).toUpperCase()+"e");
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
                result+= str.substring(i, i+1).toUpperCase();
            }else{
                result+= str.substring(i,i+1).toLowerCase();
            }
        }
        System.out.println(result);
    }


    }

