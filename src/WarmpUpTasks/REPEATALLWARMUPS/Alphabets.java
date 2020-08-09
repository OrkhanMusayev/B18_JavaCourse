package WarmpUpTasks.REPEATALLWARMUPS;
/**
        Aa, Bb, Cc, Dd, Ee
 */
public class Alphabets {

    public static void main(String[] args) {

        String upperCase = ""; // A ~ Z
        String lowerCase = ""; // a ~ z

        for(char ch1 = 'A'; ch1 <= 'Z'; ch1++){
            upperCase += ch1;
        }
        System.out.println(upperCase);


        for(char ch2 = 'a'; ch2 <= 'z'; ch2++){
            lowerCase += ch2;
        }
        System.out.println(lowerCase);

        String result ="";
        for(int i =0; i <= upperCase.length()-1; i++){
            result += upperCase.charAt(i) +""+ lowerCase.charAt(i)+" "; // here we convert char to string by using "",also we add empty string between word
        }

        System.out.println(result);


 // SECOND WAY

        int a = 97; // ascii table a' number is 97
        int A = 65; // ascii table A' number is 65

        String result1 = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)(A + i); // uppercase characters
            //              65 + 0
            char ch1 = (char)(a+i); // lowercase characters
            //                97+0

            result1 += ch + "" +ch1 + " ";
        }
        System.out.println(result1);





    }
}
