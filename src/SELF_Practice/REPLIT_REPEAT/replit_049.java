package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
STATUS CODES
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

Example:
Display message: "Enter status code:"
input: 200
Display message: "OK"
 */

public class replit_049 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int status = scan.nextInt();
        //WRITE YOUR CODE HERE

        String result = "";

        switch (status){
            case 200:
                result="OK";
                break;
            case 201:
                result="Created";
                break;
            case 202:
                result="Accepted";
                break;
            case 301:
                result="Moved Permanently";
                break;
            case 303:
                result="See Other";
                break;
            case 304:
                result="Not Modified";
                break;
            case 307:
                result="Temporary Redirect";
                break;
            case 400:
                result="Bad Request";
                break;
            case 401:
                result="Unauthorized";
                break;
            case 403:
                result="Forbidden";
                break;
            case 404:
                result="Not Found";
                break;
            case 410:
                result="Gone";
                break;
            case 500:
                result="Internal Server Error";
                break;
            case 503:
                result="Service Unavailable";
                break;
            default:
                result="Invalid status code!";
        }

        System.out.println(result);







    }
}
