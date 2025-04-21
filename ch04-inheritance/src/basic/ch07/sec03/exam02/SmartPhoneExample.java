package basic.ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        /*
        * 상속
        *  - 부모가 가지고 있는 재산(멤버)을 자식이 물려받음을 의미
        *  - 단순히 물려받는 것보다, 자바에서는 확장의 개념을 의미
        *  - 물려받은것  + a 를 할 수 있기 떄문
        * */
        SmartPhone myPhone = new SmartPhone("아이폰", "검정");

        System.out.println("myPhone.color = " + myPhone.color);
        System.out.println("myPhone.modle = " + myPhone.model);

        myPhone.printModel();

    }
}
