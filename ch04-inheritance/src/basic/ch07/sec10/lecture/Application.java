package basic.ch07.sec10.lecture;


public class Application {
    public static void main(String[] args) {
        /*
        * 추상클래스
        *  - 추상메소드를 0개 이상 포함하는 클래스
        *  - abstract 키워드를 사용해서 선언
        *  - 직접 인스턴스 생성불가 (new로 객체 생성 불가)
        *  - 하위 클래스가 상속받아 구현해양한다
        *  -> 다향성을 활용할 수 있다
        *
        * 추상메서드
        *  - 메소드 선언부만 있고 구현부는 없는 메소드
        *  - 반드시 abstract 키워드를 붙어야함
        *  - ex) public abstract void Method();
        * -> 하위 자식 클래스에 반드시 오버라이딩 해야한다
        * */
        //Product product = new Product();;
        //추상클래스 인스턴스 생성 불가

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.abstMethod();

        //instanceof : 특정 클래스나 인터페이스의 인스턴스인지 여부를 검사하는데 사용되는 연산자
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        Product product = new SmartPhone();

        //동적 바인딩
        product.abstMethod();

        Product.staticMethod();

        product.nonStaticMethod();
    }
}
