package chapter04.functionalInterface;

/**
 * @author AminSh
 */
public class Main {

    // Lambdas feature provides shorter and simple way to implement the chapter04.functionalInterface
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("hello world!");
            }
        };
    }
}
