package Kudrat;

public class UpperAndLowerCase {
    public static void main(String[] args) {

        String upper ="";
        String lower ="";
        char [] ch ={'a','B','D','T','w','C','t','K','C','o','O','f','F'};
        for (int i=0; i<ch.length;i++){
            if (ch[i]>='A' && ch[i]<='Z'){
                upper+=ch[i];
            }
            if (ch[i]>='a' && ch[i]<='z'){
                lower+=ch[i];
            }
        }

        System.out.println("Upper case: "+upper);
        System.out.println("Lower case: "+lower);


    }
}
