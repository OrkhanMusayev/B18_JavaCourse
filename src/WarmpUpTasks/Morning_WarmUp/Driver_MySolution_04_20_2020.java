package WarmpUpTasks.Morning_WarmUp;

public class Driver_MySolution_04_20_2020 {

    /**
     write a return method named getDriver1 that accepts a string parameter called Browser
     if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
     Ex: getDriver("chrome");  ==> "Chrome Driver"
     getDriver("fireFOX"); ==> "FireFox Driver"
     ....
     if the browser name does not match with any of browsers above, the method should return "Invalid"
     APPLY SWITCH STATEMENTS
     */


        public static void main(String[] args){

            System.out.println(getDriver1("firefox"));
            System.out.println(getDriver2("cybertek"));
            System.out.println(getDriver3("edge"));

        }

        public static String getDriver1(String browserName){
            String result="";
            switch (browserName.toLowerCase()){ // "ChromE".toLowerCase()==>> chrome
                case"chrome":
                    result="Chrome Driver";
                    break;
                case"firefox":
                    result="FireFox Driver";
                    break;
                case"id":
                    result="IE Driver";
                    break;
                case"safari":
                    result="Safari Driver";
                    break;
                case"edge":
                    result="Edge Driver";
                    break;
                case"Opera":
                    result="Opera Driver";
                    break;
                default:
                    result="Invalid Driver";
            }
            return result;
        }

        public static String getDriver2(String browserName){

            String result1="";
            if(browserName.equalsIgnoreCase("chrome")){// to ignore case sensitivity
                result1="Chrome Driver";
            }else if(browserName.equalsIgnoreCase("firefox")){// to ignore case sensitivity
                result1="Firefox Driver";
            }else if(browserName.equalsIgnoreCase("safari")){// to ignore case sensitivity
                result1="Safari Driver";
            }else if(browserName.equalsIgnoreCase("IE")){// to ignore case sensitivity
                result1="IE Driver";
            }else if(browserName.equalsIgnoreCase("opera")){// to ignore case sensitivity
                result1="Opera Driver";
            }else if(browserName.equalsIgnoreCase("edge")){// to ignore case sensitivity
                result1="Edge Driver";
            }else{
                result1="Invalid Driver";
            }
            return result1;
        }

        public static String getDriver3(String browserName) {
            String result2 = (browserName.equalsIgnoreCase("chrome")) ? "Chrome Driver" : (browserName.equalsIgnoreCase("safari")) ? "Safari Driver" :
                    (browserName.equalsIgnoreCase("ie")) ? "IE Driver" : (browserName.equalsIgnoreCase("opera")) ? "Opera Driver" :
                            (browserName.equalsIgnoreCase("firefox")) ? "Firefox Driver" : (browserName.equalsIgnoreCase("edge")) ? "Edge Driver" : "Invalid Driver:";

            return result2;
        }


    }


