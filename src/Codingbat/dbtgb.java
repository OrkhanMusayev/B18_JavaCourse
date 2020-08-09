package Codingbat;

public class dbtgb {

    public static void main(String[] args) {

        String str ="AAAaaaBBBbbb";
        String upperCase ="";
        String lowerCase="";

        for(int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upperCase += ch;
            }else{
                lowerCase += ch;
            }
        }

        System.out.println("Upper case :"+upperCase);
        System.out.println(lowerCase);
    }
}
