package part2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private String name;
    private List<Building> buildings;

    public LandlordInfo(String name, List<Building> buildings) {
        this.name = name;
        this.buildings = new ArrayList<>(buildings);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public String getName() {
        return name;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public double calcProfits() {
        double total = 0;

        for (Building building : buildings) {
            total += building.generateProfit();
        }
        return total;
    }
}
