package day39_AccessModifiers;

/**
 *
 * task:
 *     create class for Student:
 *             instance variables:
 *                     name, id, age, gender, grade, SSN
 *
 *                     public: name,  age, gender
 *                     private: grade, SSN, id
 */

public class PersonalInfo {

    public static String name = "Orkhan"; // public: open to the world, accessible at everywhere
    public static char gender = 'M'; // public: open to the world, accessible at everywhere

    static char grade = 'A';
    static int age = 27;

    private static long SSN = 1234567; // private: only accessible in the same class
    private static long ID = 987456123; // private: only accessible in the same class




}
