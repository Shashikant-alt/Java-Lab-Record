interface MotorBike {
    public int speed = 60;

    public void totDistance();
}

interface Cycle {
    public int distance = 100;

    public void speed();
}

class TwoWheeler implements MotorBike, Cycle {
    public void totDistance() {
        System.out.println("Displaying speed from MotorBike using method of Cycle : " + speed);
    }

    public void speed() {
        System.out.println("Displaying distance from Cycle using method of MotorBike : " + distance);
    }
}

public class Program21 {

    public static void main(String[] args) {
        System.out.println("Program 21: Example of multiple inheritance.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        TwoWheeler tw = new TwoWheeler();
        tw.totDistance();
        tw.speed();
    }
}