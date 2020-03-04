package chapter02.substitution_principle;

/**
 * @author Amin Shahimian
 */
public class House extends Building {

    private int numberOfRooms = 10;

    @Override
    public String toString() {
        return ("house");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
