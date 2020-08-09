package Kudrat;
// output == > 000102030405101112131415
public class loop_kenan {
    public static void main(String[] args) {
/*
        for(int j=0;j<2;j++){

            for(int k=0;k<10;k++){

                System.out.print(j+""+k);
                if(k==5){
                    break; // takes out of loop using k
                }
            }
        }

 */
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(j + "" + k);
                if (k == 5) {
                    break;
                }
            }

            if(j==0){
                break;
            }
        }
    }
}
