package WarmpUpTasks.Morning_WarmUp;


/**
    warmup task:
    1. create a class called Browsers
            actions: openBrowser():prints "opens the default browser"
                     closeBrowser(): closes the default browser
    2. create a class called ChromeBrowser
            actions: openBrowser(): opens the chrome browser
                     : closes the chrome browser
    3. creata a class called FirefoxBrowser
            actions: openBrowser(): opens the Firefox browser
                     closeBrowser(): closes the Firefox browser
    4. create a class called Opera browser
            actions: openBrowser(): opens the Opera browser
                     closeBrowsecloseBrowser()r(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions
     */


public class Browser {

    public void openBrowser(){System.out.println("Open the default browser");}

    public void closeBrowser(){
        System.out.println("Close the default browser");
    }

}

class ChromeBrowser extends Browser{

    public void openBrowser(){
        System.out.println("Open the chrome browser");
    }

    public void closeBrowser(){
        System.out.println("Close the chrome browser");
    }
}

class FirefoxBrowser extends Browser{

    public void openBrowser(){
        System.out.println("Open the FireFox browser");
    }

    public void closeBrowser(){
        System.out.println("Close the FireFox browser");
    }
}

class OperaBrowser extends Browser{

    public void openBrowser(){
        System.out.println("Open the Opera browser");
    }

    public void closeBrowser(){
        System.out.println("Close the Opera browser");
    }
}

class Test{

    public static void main(String[] args) {

        Browser br = new Browser();
        br.openBrowser();
        br.closeBrowser();

        System.out.println("================================================");

        ChromeBrowser ch = new ChromeBrowser();
        ch.openBrowser();
        ch.closeBrowser();

        System.out.println("================================================");

        FirefoxBrowser fr = new FirefoxBrowser();
        fr.openBrowser();
        fr.closeBrowser();

        System.out.println("================================================");

        OperaBrowser op = new OperaBrowser();
        op.openBrowser();
        op.closeBrowser();
    }
}
