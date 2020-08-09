package WarmpUpTasks.REPEATALLWARMUPS;

import java.util.Scanner;

/**
Valid credentials are :
   username : cybertek
   password : cybertekschool

Precondition :    username and password cannot be empty
                  if they are empty ==> please enter the credentials

 If user entered both valid username and password ==> log in
 If valid password,invalid username ==> username is incorrect
 If valid username,invalid password ==> password is incorrect
 If both password and username are invalid ==> invalid username and password

 */
public class Credentials2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.next();

        System.out.println("Enter your password");
        String inputPassWord = input.next();

        boolean logedIn = inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered both valid username and password

        boolean InvalidUserName =  ! inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered invalid username and valid password

        boolean InvalidPassWord = inputUsername.equals("Cybertek") && ! inputPassWord.equals("cybertekschool");
        // username is valid, but password is invalid

        if( !inputUsername.isEmpty()  && !inputPassWord.isEmpty() ){  // username and password are not empty

            if( logedIn ){
                System.out.println("Logged in");
            }else if(InvalidUserName){
                System.out.println("Password is correct, username is incorrect");
            }else if(InvalidPassWord){
                System.out.println("Username is correct, password is incorrect");
            }else{
                System.out.println("Both username and password are incorrect");
            }


        } else{ // username and password are empty
            System.out.println(" please enter the credentials");
        }


    }


    }

