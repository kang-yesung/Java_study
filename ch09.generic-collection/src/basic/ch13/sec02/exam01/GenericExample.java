package basic.ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");
        //getterd의 리턴값이 Tv
        Tv tv = product1.getKind();
        //getter의 리턴값이 String 타입
        String tvModel = product1.getModel();
        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV자동차");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
