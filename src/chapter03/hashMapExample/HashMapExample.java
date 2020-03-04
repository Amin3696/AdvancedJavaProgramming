package chapter03.hashMapExample;

import java.util.HashMap;

/**
 * @author Amin Shahimian
 */
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("karmen", 431111);
        phoneBook.put("Mi", 43222);
        phoneBook.put("Mi", 33332);
        phoneBook.put("Harvi", 43333);

        System.out.println(phoneBook);
        if (phoneBook.containsKey("Mi")) {
            phoneBook.remove("Mi");
        }
        System.out.println(phoneBook);
    }
}
