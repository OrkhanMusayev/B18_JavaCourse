package day41_Inheritance;

public class AudioBook extends Book {

    /**
     *     title (Iherited)
     *     author (Iherited)
     *     price (Iherited)
     *
     *     length (declared)
     *     listen() (declared)
     *
     *     toString() (Iherited)
     */

    // Visible variables and methods from Book class are inherited in this class
    public String length;

    public void listen(){
        System.out.println("Listening to: "+title);
    }
}
