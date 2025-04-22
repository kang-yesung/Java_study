package advanced.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.tire = new HankookTire();
        mycar.run();
        mycar.run();

        mycar.tire = new KumhoTire();
        mycar.run();
        mycar.run();
    }
}
