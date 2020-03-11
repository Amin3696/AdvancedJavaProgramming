package chapter04.streamExample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

/**
 * @author AminSh
 */
public class Library {

    public static void main(String[] args) {
/*difference of ParallelStream and Stream is in the speed of performance: Parallel make the iteration with 2 core of cpu ,
or can be done with mor core to iterate but stream will be fulfilled with one core and it would be slower than parallel.*/

        ArrayList<Book> books = populateLibrary();
        books.parallelStream()
                .filter(book -> book.getAuthor().startsWith("S"))
                //      .filter(book -> book.getTitle().contains("power"))
                .forEach(System.out::println);

        long number = books.stream()
                .filter(book -> book.getAuthor().contains("mi"))
                .count();
        System.out.println("number of books are written by Amin and Shamissa is: " + number);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice", "The Color purple"));
        books.add(new Book("Amin", "The power of silence"));
        books.add(new Book("Shamissa", "The power of smile"));
        books.add(new Book("Amin", "The power of thinking"));
        books.add(new Book("Amin", "The Color of good win"));
        books.add(new Book("Shamissa", "The smell of tofu"));
        books.add(new Book("Peter", "small steps, big journey"));
        books.add(new Book("Michal", "good advice for after big party"));
        books.add(new Book("Amin", "dont be late for enjoy!"));
        books.add(new Book("Sam", "how to make life more simple!"));

        return books;

    }
}
