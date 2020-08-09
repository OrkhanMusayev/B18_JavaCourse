package WarmpUpTasks.Night_WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffer {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Pittsburgh", "FedEx", 105000, true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Menlo Park", "Facebook", 130000, false);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Seattle", "Amazon", 150000, false);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("Pittsburgh", "PNC Bank", 110000, true);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("Sunnyvale", "Linkedin", 100000, false);


        ArrayList<Offer> myOffers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        for (Offer each : myOffers) {
            System.out.println(each);
        }

        System.out.println("============================================================================================");

        String myArea = "Pittsburgh"; // my current location

        myOffers.removeIf(p -> !p.isFullTime || !p.location.equals(myArea) || p.salary < 100000);

        for (Offer each : myOffers) {
            System.out.println(each);


        }
    }
}
