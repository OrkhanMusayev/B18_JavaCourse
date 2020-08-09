package day47_Abstraction.Task1;

public final class OperaDriver extends RemoteWebDriver {

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in Opera Browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing Opera browser");

    }


}
