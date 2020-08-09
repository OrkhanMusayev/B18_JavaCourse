package Ramil;

public class Frequency {
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

   public static String frequency(String str){
        String result="";

        for (int i=0;i<str.length();i++){
            int count=0;
            for (int j=0;i< str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count>=1 && !result.contains(""+str.charAt(i))){
                result+=str.charAt(i)+""+count;
            }
        }

        return result;
   }

    public static void main(String[] args) {
        String str = " AAABBCDD ";
        System.out.println(frequency(str));
    }
}
