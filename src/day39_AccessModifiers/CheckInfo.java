package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);

        //System.out.println("Grade: "+PersonalInfo.grade); // error because private: only accessible in the same class
        //System.out.println("SSN: "+PersonalInfo.SSN); // error because private: only accessible in the same class
        //System.out.println("ID: "+PersonalInfo.ID); // error because private: only accessible in the same class
        System.out.println("Age: "+PersonalInfo.age);

        PersonalInfo obj = new PersonalInfo();
        System.out.println( obj.name);
        System.out.println( obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

        //  System.out.println(obj.SSN); //  private: only accessible in the same class
        //  System.out.println( obj.ID ); //  private: only accessible in the same class



    }
}
