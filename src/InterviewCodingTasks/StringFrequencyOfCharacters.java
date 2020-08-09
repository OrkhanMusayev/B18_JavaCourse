package InterviewCodingTasks;

/**
 * Write a return method that can find the frequency of characters
 *
 * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "AAABBCDD"; //  ==> A3B2C1D2

        String result = "";


        for(int i = 0; i <= str.length()-1; i++){

            int count = 0;

            for(int j =0; j <=str.length()-1; j++){

                if(str.charAt(i) == str.charAt(j)){
                    count ++ ;
                }
            }
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i) + ""+count;
            }
        }
        System.out.println(result);


    }
}
