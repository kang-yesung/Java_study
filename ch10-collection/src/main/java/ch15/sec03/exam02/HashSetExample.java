package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();
//Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
//저장된 객체 수 출력
        System.out.println("총 객체 수 : " + set.size());

        //생성된 객체의 주소가 다르기 때문에 총 객체 수는 2 다

    }
}
