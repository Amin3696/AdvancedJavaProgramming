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
        printBuildings(buildings);

        //List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        //List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);


    }

    private static void printBuildings(List<? extends Building> buildings) {
        System.out.println();
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ":" + buildings.get(i).toString());
        }
    }
}

