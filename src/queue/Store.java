package queue;

import java.util.LinkedList;

/**
 * @author Amin Shahimian
 */
public class Store {
    //several classes are in java API implement the queue, I used LinkedList for FIFO ;)
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("a"));
        queue.add(new Customer("b"));
        queue.add(new Customer("c"));
        queue.add(new Customer("d"));
        queue.add(new Customer("e"));
        System.out.println(queue);
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            serveCustomer(queue);
            System.out.println(queue);
        }

    }

    private static void serveCustomer(LinkedList<Customer> queue) {
        Customer first = queue.poll();
        first.serve();
    }
}
