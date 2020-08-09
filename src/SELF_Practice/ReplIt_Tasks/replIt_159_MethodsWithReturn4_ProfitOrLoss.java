package SELF_Practice.ReplIt_Tasks;

/**
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"

 */

public class replIt_159_MethodsWithReturn4_ProfitOrLoss {

    public static String c_profits (int buyPrice,int sellPrice){
        //your code here

        String result = (buyPrice<sellPrice)?"profit":(buyPrice>sellPrice)?"loss":"no loss";
        return result;
    }

    public static void main(String[]args){
        String str = c_profits(100,100);
        System.out.println(str);
        str=c_profits(20,5);
        System.out.println(str);
        str=c_profits(100,1500);
        System.out.println(str);
    }
}

