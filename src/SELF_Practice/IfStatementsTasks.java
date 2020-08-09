package SELF_Practice;

public class IfStatementsTasks {
    public static void main(String[] args) {
        int hour = 12;
        String result = "";
        if (hour<12){
            result = "Good Morning";
        }else if (hour>=12 && hour<3){
            result = "Good Afternoon";
        }else if(hour>=3){
            result = "Good Evening";
        }
        System.out.println(result);




    }
}
