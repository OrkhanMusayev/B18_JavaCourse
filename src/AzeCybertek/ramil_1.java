package AzeCybertek;

public class ramil_1 {

    public static void main(String[] args) {

// first solution
        String word="ABCD"; //  output DCBA  Stringbulder then loop

        StringBuilder rev = new StringBuilder(word);
        rev.reverse();
        System.out.println(rev); // DCBA

// second solution

        for (int i=word.length()-1;i>=0;i--){
            System.out.print( word.charAt(i) );
        }



    }
}
