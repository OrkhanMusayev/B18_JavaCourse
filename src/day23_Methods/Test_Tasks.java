package day23_Methods;
/**
1. write a method that can print all odd number between 1 ~ 100
2.write a method that can print all even number between 1 ~ 100
 */
public class Test_Tasks {

    public static void main(String[] args) {

        oddNum();

        evenNum();
    }
    // 1 is task
    public static void oddNum(){
        for(int i =1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void evenNum(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

}

