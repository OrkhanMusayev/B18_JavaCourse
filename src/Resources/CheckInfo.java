package Resources;

import day39_AccessModifiers.PersonalInfo; // i have to import PersonalInfo class

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);

       // System.out.println(PersonalInfo.grade); default accessible with the same package
      //  System.out.println(PersonalInfo.age); default accessible with the same package

      //  System.out.println(PersonalInfo.SSN);  private: only accessible in the same class
      //  System.out.println(PersonalInfo.ID);   private: only accessible in the same class

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

        //System.out.println(obj.grade); default accessible with the same package
        //System.out.println(obj.age); default accessible with the same package

        //System.out.println(obj.SSN);  private: only accessible in the same class
        //System.out.println(obj.ID);   private: only accessible in the same class



    }
}
