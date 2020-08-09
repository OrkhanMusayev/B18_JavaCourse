package SELF_Practice.Arrays;

public class USA_Prezidents {

    public static void main(String[] args) {
        String[] presidents = {"George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe",
                "John Quincy Adams", "Andrew Jackson", "Martin Van Buren", "William Henry Harrison", "John Tyler", "James K Polk",
                "Zachary Taylor", "Millard Fillmore", "Franklin Pierce", "James Buchanan", "Abraham Lincoln", "Andrew Johnson",
                "Ulysses S. Grant", "Rutherford B. Hayes", "James A. Garfield", "Chester A. Arthur", "Grover Cleveland",
                "Benjamin Harrison", "Grover Cleveland", "William McKinnley", "Theodore Roosevelt", "William H Taft",
                "Woodrow Wilson", "Warren G. Harding", "Calvin Coolidge", "Herbert Hoover", "Franklin D. Roosevelt", "Harry S Truman",
                "Dwight D. Eisenhower", "John F. Kennedy", "Lyndon B. Johnson", "Richard M. Nixon", "Gerald R. Ford", "James Earl Carter",
                "Ronald Reagan", "George H. W. Bush", "William J. Clinton", "George W. Bush", "Barack H. Obama", "Donald J. Trump"};

        for (int i = 0; i <= 44; i++) {
            String result = presidents[i];
            System.out.println(result);
        }

    }
}