package generic_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amin Shahimian
 */
public class GenericMethods {

    private static Character[] charArray = {'f', 'a', 'r', 't'};
    private static Integer[] intArray = {1, 0, 0, 3};
    private static Boolean[] boolArray = {true, true, false, true};

    //the arrayToList uses Object type which is parent of all types in Java

    private static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        //no runtime error happens Although the type of intList be String and the error is not traceable!
        System.out.println(intList.get(0));
        // but now:
   /* Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        	at generic_methods.GenericMethods.main(GenericMethods.java:29)*/
    }
//check the approach in GenericMethods2
}
