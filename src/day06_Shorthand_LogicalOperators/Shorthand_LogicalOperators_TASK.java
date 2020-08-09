package day06_Shorthand_LogicalOperators;

public class Shorthand_LogicalOperators_TASK {
    public static void main(String[] args){

       int ApplesCount = 20;
       int OrangesCount = 30;
       int PearsCount = 30;
       boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
                     // 20<30 || 30>=30 ==>False||True==>TRUE
        System.out.println(comp);

        System.out.println("====================================================");

        String OutsideWeather;
        int Degree;
        OutsideWeather = "Shinny";
        Degree = 70;
        boolean comp2 = (!(OutsideWeather == "Rainy"||Degree==70));
                         //  (False||True)==>True==>!True==>FALSE
        System.out.println(comp2);

        System.out.println("=====================================================");

        int b = 2;
        boolean res = ++b == 2|| --b == 2 && --b == 2;
        //            3 == 2  ||   2 == 2 &&   1 == 2
        //            False || True && False
        //                    FALSE
        System.out.println(res);

        System.out.println("=========================================================");

        boolean x = true , z = true;
        int y = 20;
        x = (y!=10) || (z = false);
        //  20!=10  || true=false
        //  true    || true == > TRUE
        System.out.println(x);

        System.out.println("===========================================================");





    }
}
