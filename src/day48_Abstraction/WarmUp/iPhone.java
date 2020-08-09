package day48_Abstraction.WarmUp;

public  class iPhone extends Phone {

    static {
        brand = "iPhone";
    }
    public iPhone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting with "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming with "+phoneNumber);
    }


}
