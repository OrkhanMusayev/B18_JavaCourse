package InterviewCodingTasks;

public class RemoveDuplicates {

    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }

    public static void main(String[] args) {

        String str = "AAABBBCCC"; // ==> ABC

        System.out.println(removeDup(str));
    }
}
