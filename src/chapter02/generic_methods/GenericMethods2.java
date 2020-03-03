package chapter02.generic_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amin Shahimian
 */
public class GenericMethods2 {

    private static Character[] charArray = {'f', 'a', 'r', 't'};
    private static Integer[] intArray = {1, 0, 0, 3};
    private static Boolean[] boolArray = {true, true, false, true};

    //create a new type variable which I will call T
    //this type variable just has local scope means it can be used just inside this particular method
    //inside the argument , replace the Object with T

    private static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        //runtime error happens if the type of intList be String
        // in this approach we can keep code flexible and mean time trace the error
    }
}

