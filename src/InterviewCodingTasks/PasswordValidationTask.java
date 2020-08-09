package InterviewCodingTasks;

/**
 * 1. Write a return method that can verify if a password is valid or not.
 *
 * requirements:
 *
 *  1. Password MUST be at least have 6 characters and should not contain space
 *
 * 2. PassWord should at least contain one upper case letter
 *
 * 3. PassWord should at least contain one lowercase letter
 *
 * 4. Password should at least contain one special characters
 *
 * 5. Password should at least contain a digit
 * if all requirements above are met, the method returns true, otherwise returns  false
 */
public class PasswordValidationTask {

    //Solution 1:

    public static boolean PassWordvalidation(String password) {

        String lowercase = "(.*[a-z].*)";

        String uppercase = "(.*[A-Z].*)";

        String numbers = "(.*[0-9].*)";

        String specialchars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars),

                Valid = false;

        if (password.length() >= 6 && !password.contains(" "))

            if (HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;


        //Solution 2:

//        boolean Character6 = false;
//        boolean Uppercase = false;
//        boolean Lowercase = false;
//        boolean specialcharacter = false;
//        boolean digit = false;
//        boolean result = false;
//        if (password.length() >= 6 && !password.contains(" ")) {
//            Character6 = true;
//        }
//        for (int i = 0; i < password.length(); i++) {
//            if (Character.isUpperCase(password.charAt(i))) {
//                Uppercase = true;
//            }
//            if (Character.isLowerCase(password.charAt(i))) {
//                Lowercase = true;
//            }
//            if (!Character.isDigit(password.charAt(i)) && !Character.isAlphabetic(password.charAt(i))) {
//                specialcharacter = true;
//            }
//            if (Character.isDigit(password.charAt(i))) {
//                digit = true;
//            }
//        }
//        if (Character6 && Uppercase && Lowercase && specialcharacter && digit) {
//            result = true;
//        }
//        return result;

    }
        public static void main (String[]args){
            System.out.println(PassWordvalidation("Ork$a1"));

    }
}