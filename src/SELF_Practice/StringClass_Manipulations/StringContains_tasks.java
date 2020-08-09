package SELF_Practice.StringClass_Manipulations;

public class StringContains_tasks {

        public static void main(String args[]){
            String str = "Do you like watching Game of Thrones";
            System.out.println(str.contains("like"));

            /* this will print false as the contains() method is
             * case sensitive. Here we have mentioned letter "l"
             * in upper case and in the actual string we have this
             * letter in the lower case.
             */
            System.out.println(str.contains("Like"));// false because upperCase Like
            System.out.println(str.contains("Game"));
            System.out.println(str.contains("Game of"));

            System.out.println("========================================================");

            String str1 = "This is an example of contains()";

            /* Using the contains() method in the if-else statement, since
             * this method returns the boolean value, it can be used
             * as a condition in if-else
             */
            if(str1.contains("example")){
                System.out.println("The word example is found in given string");
            }
            else {
                System.out.println("The word example is not found in the string");


            }

            System.out.println("==============================================================");

            String str2 = "Just a Simple STRING";
            String str3 = "string";

            //Converting both the strings to lower case for case insensitive checking
            System.out.println(str2.toLowerCase().contains(str3.toLowerCase()));

            //You can also use the upper case method for the same purpose.
            System.out.println(str2.toUpperCase().contains(str3.toUpperCase()));



        }
    }

