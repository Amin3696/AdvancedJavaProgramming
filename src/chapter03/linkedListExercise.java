package chapter03;

import java.util.LinkedList;

/**
 * @author Amin Shahimian
 */
public class linkedListExercise {
    //main advantage of LinkedList: quick in inserting and removing elements in the middle of list
    //LinkedList uses more memory than ArrayList because each entry in linkedList contains reference and also to the next and previous elements
    //in the most use cases ArrayList is better choice than LinkedList
    public static void main(String[] args) {
        LinkedList myList = new LinkedList<>();
        myList.add("first guy");
        myList.add("third guy");
        myList.add("fourth guy");
        myList.add(1, "second guy");
        System.out.println(myList);

        myList.remove("second guy");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

    }

}
