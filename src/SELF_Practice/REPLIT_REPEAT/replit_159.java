package SELF_Practice.REPLIT_REPEAT;

/**
 * c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
 * it returns a string value that can be "profit","loss","no loss"
 *
 * for example:
 * c_profis(100,1500)
 * returns : "profit"
 *
 * c_profis(20,5)
 * returns : "loss"
 *
 * c_profis(100,100)
 * returns : "no loss"
 */
public class replit_159 {

    public static String c_profits(int buyPrice,int sellPrice){

        if (buyPrice<sellPrice){
           return "profit";
        }else if(buyPrice>sellPrice){
            return "loss";
        }else{
            return "no loss";
        }


    }

    public static void main(String[] args) {
        System.out.println(c_profits(1500,1500));
    }
}
