package day09_NestedIf_Ternary;
/*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */
public class AgeGroups_WarmUp {
    public static void main (String[] args){

        int age = 27;
        String  Agegroup ="";
        if(age<3 && age>0){
            Agegroup = "Baby";
        }else if(age >= 3 && age <= 5){
            Agegroup = "Toddler";
        }else if(age >= 6 && age <= 9){
            Agegroup = "Kid";
        }else if(age >= 10 && age <= 12){
            Agegroup = "Pre-Teen";
        }else if(age >= 13 && age <= 17){
            Agegroup = "Teenager";
        } else if (age >=18 && age <=20){
            Agegroup="Young Adult";
        } else if (age >=21 && age <=39){
            Agegroup="Adult";
        } else if (age >= 40 && age <= 49){
            Agegroup="Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54){
            Agegroup="Middle-Aged Adult";
        } else if (age >= 55 && age <= 64){
            Agegroup ="Very Young Senior Citizen";
        } else if (age >= 65 && age <=74){
            Agegroup="Young Senior Citizen";
        } else if (age >= 75 && age <=84){
            Agegroup="Senior Citizen";
        } else if (age >= 85 && age <= 120){
            Agegroup = "Old Senior Citizen";
        }else{
            Agegroup = "Invalid age";
        }

        System.out.println(Agegroup);

        boolean eligibleToBuy =  Agegroup == "Adult" || Agegroup == "Young Middle-Aged Adult" ||
                Agegroup == "Middle-Aged Adult";

        if(eligibleToBuy){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }






    }
}
