package Kudrat;

public class aaa {

    public static void main(String[] args) {

        String str = "One two three four";    // enO owt eerht four

        String [] word = str.split(" ");

        for (int i=0; i < word.length; i++){
            if (word[i].length() % 2 !=0){
                String temp = word[i];
                String temp2 ="";
                for (int j= temp.length()-1; j >=0; j--){
                    temp2 += temp.charAt(j);
                    word[i] = temp2;
                }
            }
        }

        String result ="";
        for (String each : word){
            result +=each+" ";
        }
        result = result.trim();
        System.out.println(result);
    }
}
