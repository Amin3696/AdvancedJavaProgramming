package chapter04.methodReferencesExample;

/**
 * @author AminSh
 */
public class Square {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength * sideLength;
    }
}
