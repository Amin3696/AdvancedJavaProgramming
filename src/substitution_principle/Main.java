package substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        /*the substituted class (Office) which extended from (Building )is not compatible with List*/

      /*  List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);*/

/*
        Error:(24, 24) java: incompatible types: java.util.List<substitution_principle.Office> cannot be converted to java.util.List<substitution_principle.Building>
        THE SOLUTION IS WILDCARDS
*/

    }

    private static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    private static void printBuildings(List<Building> buildings) {
        System.out.println();
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ":" + buildings.get(i).toString());
        }
    }
}
