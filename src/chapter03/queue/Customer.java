package chapter03.queue;


/**
 * @author Amin Shahimian
 */
public class Customer {

    private String name;
    private boolean hasBeenServed;

    public Customer(String name) {
        hasBeenServed = false;
        this.name = name;
    }

    public void serve() {
        hasBeenServed = true;
        System.out.println(name + " has served.");
    }

    @Override
    public String toString() {
        return name;
    }
}
