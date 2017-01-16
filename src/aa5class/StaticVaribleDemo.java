package aa5class;

/**
 * Created by patimshi on 12/4/2016.
 */
class Bicycle {

    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }

}

public class StaticVaribleDemo {
    public static void main(String[] args) {
        System.out.println(new Bicycle(1, 1, 1));

    }
}
