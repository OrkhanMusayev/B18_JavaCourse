package Kudrat;
// Aa Bb Cc
public class UpperCaseLowerCase {

    public static void main(String[] args) {

        String result1="";
        String result2="";
        String mainresult="";
        for (char i='A';i<='Z';i++){
            result1+=i;
        }
        for (char i='a';i<='z';i++){
            result2+=i;
        }

        for(int i=0;i<result1.length();i++){
            mainresult+=result1.substring(i,i+1)+result2.substring(i,i+1)+" ";
        }
        System.out.println(mainresult);
    }
}
