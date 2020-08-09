package day48_Abstraction.WarmUp;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("X",1000,"10 inches");
        System.out.println(iphone1);

        iPhone iphone2 = new iPhone("11 Pro Max",1500,"11 inches");
        System.out.println(iphone2);

        iphone1.faceTiming(9278636);
        iphone1.texting(9278636);
        iphone1.texting(9278636);

        System.out.println("==================================================================");


        Samsung samsung1 = new Samsung("Note 10 Plus",1300,"Large");
        System.out.println(samsung1);

        samsung1.calling(9279301);
        samsung1.texting(9279301);
        samsung1.superCharge();


    }
}
