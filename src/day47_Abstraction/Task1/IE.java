package day47_Abstraction.Task1;

public final class IE extends RemoteWebDriver {

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in IE browser");
    }

    @Override
    public void quit() {
        System.out.println("IE browser closing");
    }
}
