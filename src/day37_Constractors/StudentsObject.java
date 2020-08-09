package day37_Constractors;

public class StudentsObject {

    public static void main(String[] args) {


        Student student1 = new Student("Amar",18,'M',"Harvard University");

        //student1.setInfo("Amar",34,'M',"Harvard University");
        System.out.println(student1);

        Student student2 = new Student("Aisha",19,'F',"Stanford University");
        System.out.println(student2);
    }
}
