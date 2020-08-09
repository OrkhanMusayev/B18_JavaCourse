package day19_Arrays;

public class Arrays_Practice1 {

    public static void main(String[] args) {

        String[] familyNames = {"Orkhan","Aisha","Yegana","Amar","Ramazan"};
        //                         0        1        2       3        4

        String dadName = familyNames[4];
        System.out.println(dadName);
        System.out.println(familyNames[3]);

        System.out.println("========================================================");


        for(int i = 0; i < 5; i++){
            String name = familyNames[i];
            System.out.println(name);
        }

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        //print out all the users who registered with their gmail..
        // so we need to check all strings .. that's a loop
        // we need  a condition.. that's if statement
        // max: 4

        for (int i = 0; i <= 3; i++){       // this loop will execute 4 times
            String email = emails[i];       //  to retrieve each element in the array
            if (email.endsWith("@gmail.com")){  //  To apply our condition to each element of array
                System.out.println(email);      //  cybertek@gmail.com
            }
        }

            }
        }



