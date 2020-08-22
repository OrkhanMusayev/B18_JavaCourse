package AzeCybertek;

public class solmazPowerNumbers {

    public static void main(String[] args) {
// 5*5*5 *5 = 5 ustu 4 demekdi
        int num =5;
        int power =4;  // 625
        int result =1;
        while(power>0){
            result*=num;
            power--;
        }
        System.out.println(result);
    }
}
