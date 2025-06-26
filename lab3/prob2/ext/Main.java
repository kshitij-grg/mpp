package prob2.ext;

import prob2.Apartment;
import prob2.Building;
import prob2.LandlordInfo;

import java.util.Arrays;

/**
 * Main class is for testing your code; you can uncomment
 * the code here once you have implemented classes.
 * <p>
 * However, the way
 * data has been populated into the LandlordInfo and Building
 * objects violates the design indicated in the UML diagram for
 * this problem. Refactor the code in the main method so that
 * data is loaded in a correct manner; you can verify that you
 * have done this successfully by moving the Main class into a
 * different package.
 */
public class Main {

    public static void main(String[] args) {
        Apartment[] apts0 = {
                new Apartment(600),
                new Apartment(700)};
        Apartment[] apts1 = {
                new Apartment(500),
                new Apartment(450)
        };
        Apartment[] apts2 = {
                new Apartment(1100),
                new Apartment(650)};

        Apartment[] apts3 = {
                new Apartment(6750),
                new Apartment(945)
        };
        Building[] bldgs = {
                new Building(150, Arrays.asList(apts0)),
                new Building(175, Arrays.asList(apts1)),
                new Building(150, Arrays.asList(apts2)),
                new Building(175, Arrays.asList(apts3))
        };

        LandlordInfo landlord = new LandlordInfo("Kshitij", Arrays.asList(bldgs));
        System.out.println(landlord.calcProfits());
    }
}


