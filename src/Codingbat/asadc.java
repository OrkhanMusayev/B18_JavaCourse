package Codingbat;

public class asadc {

    public static void main(String[] args){

        String str = "AzeCybertek";

        String result="";

        for(int i = str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
