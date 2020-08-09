package day07_IfStatements;

public class IfStatementTask3_2triangle {
    public static void main(String[] args) {

        int angle1= 50;
        int angle2 = 60;
        int angle3 = 80;

        double sumOfAngles = (angle1+angle2+angle3);
        boolean validthreangle = sumOfAngles == 180;
        boolean notvalidthreangle = sumOfAngles != 180;
        if(validthreangle){
            System.out.println("Valid three angles");
        }
        if(notvalidthreangle){
            System.out.println("Not valid three angles");
        }

        System.out.println("==============================================");

        double angleX = 40;
        double angleY = 80;
        double angleZ =60;
        double SUMofAngles = (angleX+angleY+angleZ);
        boolean validthreeangle = SUMofAngles == 180;
        boolean invalidthreeangle = SUMofAngles != 180;
        if(validthreeangle){
            System.out.println("Correct three angle");
        }
        if(invalidthreeangle){
            System.out.println("Incorrec three angle");
        }









    }
}
