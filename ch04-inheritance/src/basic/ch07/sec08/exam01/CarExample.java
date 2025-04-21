package basic.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        //Tire 타입의 tire속성이 정의되지 않음
//        Tire tire = new Tire();
//        Tire tire = new HankookTire(); //다형성의 업캐스팅
//        Tire tire = new TeslaTire(); //다형성의 업캐스팅
        Tire tire = new KumhoTire(); //다형성의 업캐스팅

        //하나의 객체가 여러가지의 타입을 가질 수 있다
        mycar.tire = tire;

        mycar.run();

    }
}
