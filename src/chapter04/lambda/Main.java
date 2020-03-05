package chapter04.lambda;

import chapter04.functionalInterface.GreetingMessage;

/**
 * @author AminSh
 */
public class Main {

    public static void main(String[] args) {
        chapter04.lambda.GreetingMessage gm = new chapter04.lambda.GreetingMessage() {

            @Override
            public void greet(String name) {
                System.out.println("hello " + name);

            }
        };

        gm.greet("Amin");

        //using chapter04.lambda
        //less and cleaner code (easy to understand) with chapter04.lambda
        GreetingMessage gm2 = (name) -> {
            System.out.println("hello " + name);
        };
        gm2.greet("Amin");

        MessagePrinter mP = () -> {
            System.out.println("my Message");
        };

        mP.printMessage();
    }
}
