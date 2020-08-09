package day46_Final_AbstractIntro;

public class final_Encapsulation {

    final private int data1 = 200;
    private int data2 = 300;

    public int getData1(){
        return data1;
    }
/*
    public void setData1(int data1){
        this.data1 = data1; // you can not set data because above u used final keyword
    }

 */

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }
}
