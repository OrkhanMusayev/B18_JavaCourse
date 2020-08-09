package Resources;

import Resources.Library;

public class Test1 {

    public static void main(String[] args) {

        String str = "ABCDABABABABA";
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);


        String str1 = "AABBCDEB";
        String str2 = "B";

       int num1 =  Library.Frequency(str1,str2);
        System.out.println(num1);

        String str3 = "MMMNNNJJJJJIIIIUUUUUUYYYYYYYY";
        String result3 = Library.FrequencyOfChars(str3);
        System.out.println(result3);


        int[] arr = {10,5,15};
        int result4 = Library.MaxNumber(arr);
        System.out.println(result4);

        int[] arr1 = {10,15,5};
        int result5 = Library.MinNumber(arr1);
        System.out.println(result5);


        int a = 100;
        int b = 150;
        int result6 = Library.LargestNumber(a,b);
        System.out.println(result6);



    }
}
