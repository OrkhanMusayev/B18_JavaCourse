package AzeCybertek;

public class solmazRemoveWhiteSpace {

    public static void main(String[] args) {

        String str = "I Love Java";
        String result="";
        str=str.replaceAll(" ", "");
//  str = new StringBuffer(str).reverse().toString();
        for(int i=str.length()-2; i>0; i-=2){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
