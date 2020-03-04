package linkedHashMapExample;

import java.util.LinkedHashMap;

/**
 * @author Amin Shahimian
 */
//to retain the order of element, I use the LinkedHashMap :)
//LinkedHashMap could be constructed with 3 value in arg(initialCapacity, loadFactor,accessOrder)
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> orderedPhoneBook = new LinkedHashMap<>();
        orderedPhoneBook.put("Kelly", 123456);
        orderedPhoneBook.put("Stefan", 654321);
        orderedPhoneBook.put("Jorgen", 78910);

        System.out.println("kelly's phone number is:" + orderedPhoneBook.get("Kelly"));


    }
}
