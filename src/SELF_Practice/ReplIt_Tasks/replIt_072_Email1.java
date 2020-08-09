package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

/**
In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */

public class replIt_072_Email1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if(email.contains("_")){
            String firstName = email.substring(0,email.indexOf("_"));
        }

    }
}
