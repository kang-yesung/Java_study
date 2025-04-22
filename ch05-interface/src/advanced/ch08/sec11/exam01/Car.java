package advanced.ch08.sec11.exam01;

public class Car {
    public  Tire tire1 = new HankookTire();
    public  Tire tire2 = new HankookTire();

    public void run() {

        tire1.roll();
        tire2.roll();
    }
}
