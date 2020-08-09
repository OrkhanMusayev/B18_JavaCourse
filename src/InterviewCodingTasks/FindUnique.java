package InterviewCodingTasks;

/**
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class FindUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String unique = "";


        for(int j=0; j <= str.length()-1; j++ ){
            int count = 0 ;  // to count the occurrence of the character

            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == str.charAt(j)){  // check how many time the character is  occurred in the string
                    count++;
                }
            }

            if(count == 1){
                unique+= ""+str.charAt(j);
            }
        }
        System.out.println(unique);



    }
}
