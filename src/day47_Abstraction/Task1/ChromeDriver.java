package day47_Abstraction.Task1;

public final class ChromeDriver extends RemoteWebDriver {

    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in chrome browser");
    }

    @Override
    public void quit(){
        System.out.println("Chrome browser closing");
    }
}
