package Kudrat;

public class UniquePractice {

    public static void main(String[] args) {

        String str = "AABCC"; // B
        String unique = "";

        for(int i=0; i<=str.length()-1;i++){
            char ch1 = str.charAt(i);
            int count=0;

            for (int x=0;x<=str.length()-1;x++){
                char ch2=str.charAt(i);
                if (ch2==ch1){
                    count++;
                }

            }

            if(count==1){
                unique+=ch1;
            }
        }

        System.out.println(unique);



    }
}
