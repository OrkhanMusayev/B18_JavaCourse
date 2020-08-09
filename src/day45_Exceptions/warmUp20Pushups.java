package day45_Exceptions;

public class warmUp20Pushups {

    public static void main(String[] args){

        int pushups = 1;
        while (pushups <= 20){ // 20 pushups
            System.out.println("Pushup " + pushups); // pushups1,2,3...
            try {
                Thread.sleep(300);
            }catch (Exception e){

            }
            pushups++;
        }
    }
}
