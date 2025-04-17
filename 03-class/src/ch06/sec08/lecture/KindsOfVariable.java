package ch06.sec08.lecture;

public class KindsOfVariable {
    /*
    * 클래스 영역애 작성하는 변수
    * 필드 == 멤버변수 == 전역변수(클래스 전역에서 사용가능한 변수)
    * */

    //인스턴스 변수 : non-static 필드를의미
    //-> 인스턴스 생성 시점에 사용 가능한 변수라는 의미
    private int globalNum;

    //정적 필드 == 클래스변수 : static 필드를 의미
    private static int stativNum;

    public void testMethod(int 매개변수){
        /*
        * 지역변수 : 메서드 영역에서 작성하는 변수
        * -> 매개변수도 일종의 지역변수
        * */
        int local;
    } // 메서드 영역 끝
} // 클래스 영역 끝

/*
 * 1. 클래스의 구조와 클래스를 작성하는 방법에 대해
 * 2. 클래스로 객체를 만드는 상황에서 메모리 구조에 대해
 * 3. 접근제어자의 종류와 각각의 범위에 대해
 * 4. 생성자의 역할과 언제 호출되는지 + this에 대해
 * 5. 메서드의 작성 방식과 구조에 대해 (반환 타입의 유무는 어떤 차이가 있는가?, 오버로딩이란?)
 * */