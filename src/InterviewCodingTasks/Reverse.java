package InterviewCodingTasks;

public class Reverse {

    public static void main(String[] args) {

        String name1 = "ABCD"; // ==> DCBA
        ReverseString(name1);

        String name2 = "Aze Cybertek";
        ReverseString(name2);

    }


    public static void ReverseString(String str){

        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();

    }
    }

