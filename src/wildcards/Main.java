package wildcards;

import substitution_principle.Building;
import substitution_principle.House;
import substitution_principle.Office;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amin Shahimian
 */
public class Main {

    public static void main(String[] args) {

        //List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        System.out.println("using in-variable!");
        printBuildings(buildings);

        //List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        System.out.println("using in-variable!");
        printBuildings(offices);

        //List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        System.out.println("using in-variable!");
        printBuildings(houses);

        addHouseToList(houses);
        addHouseToList(buildings);

        System.out.println("using out variable!");
        printBuildings(houses);
        printBuildings(buildings);


    }

    private static void printBuildings(List<? extends Building> buildings) {
        System.out.println();
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ":" + buildings.get(i).toString());
        }
    }

    private static void addHouseToList(List<? super House> houses) {
        houses.add(new House());
        System.out.println();
    }
}

