package SELF_Practice;

public class If_Else_If_Task {
    public static void main(String[] args) {

        int mark = 60;
        String result = "";
        if(mark<60){
            result = "Fail";
        }else if(mark>=60 && mark<90){
            result = "Pass";
        }else if(mark>=90){
            result = "Passed with Distinction";
        }
        System.out.println(result);











    }
}
