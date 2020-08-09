package day47_Abstraction.Task1;

public final class Safari extends RemoteWebDriver {

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in Safari browser");
    }

    @Override
    public void quit() {
        System.out.println("Safari browser closing");

    }
}
