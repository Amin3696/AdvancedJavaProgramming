package chapter04.methodReferencesExample;

import java.util.function.Consumer;

/**
 * @author AminSh
 */
//Method references are shorter way to write certain type of lambda expression
// lambdas expressions that parses a variable and calls method in that variable, it could be replace with method reference

public class Main {
    public static void main(String[] args) {
        Square s = new Square(5);


        //without Method reference
        Shapes shape1 = (Square square) -> {

            return square.calculateArea();
        };
        System.out.println("Area: " + shape1.getArea(s));

        //With Method reference

        Shapes shape2 = Square::calculateArea;
        System.out.println("Area: "+shape2.getArea(s));

    }
}

