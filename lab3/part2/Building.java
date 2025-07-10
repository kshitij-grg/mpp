package part2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost, List<Apartment> apartments) {
        this.apartments = new ArrayList<>(apartments);
        this.maintenanceCost = maintenanceCost;
    }

    public double generateProfit() {
        double total = 0;
        for (Apartment apartment : apartments) {
            total += apartment.getRent();
        }
        return total - maintenanceCost;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }
}
