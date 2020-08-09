package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

    /**
    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
     */

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Bank of America", 100000, false);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "Capital One", 98000, false);

        Offer offer3 = new Offer();
        offer3.setInfo("PA", "PNC Bank", 110000, true);

        Offer offer4 = new Offer();
        offer4.setInfo("CA", "Google", 150000, true);

        Offer[] offers = {offer1,offer2,offer3,offer4};

        String myLocation = "PA";  // my current location

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList( offers ));

 // FIRST WAY
        // Accept.removeIf ( p ->  p.salary < 100000 || p.isFullTime == false || !p.location.equals(myLocation));
        // we gonna remove all offers which less than 100K or not full time job position

// SECOND WAY
        Accept.removeIf( p -> p.salary < 100000); // salary less than 100K
        Accept.removeIf( p-> !p.isFullTime); // remove if job position not full time
        Accept.removeIf(p-> !p.location.equals(myLocation)); // remove if location is not from my area

        System.out.println(Accept.size());

        for(Offer eachOffer : Accept){
            System.out.println(eachOffer);
        }



    }
}
