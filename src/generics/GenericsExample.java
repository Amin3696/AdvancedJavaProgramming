package generics;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amin Shahimian
 */
public class GenericsExample {
    public static void main(String[] args) {

        // Example without Generics
        List names = new ArrayList<>();
        names.add("Armin");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
        names.add(27);
        System.out.println(names.get(1));
        //without Generics , compiler adds all types to the list :(

        // Example with Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Anton");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        //names2.add(23);
        //using Generics , compiler check to add just the String to the list so it make code safer :)
    }

}
