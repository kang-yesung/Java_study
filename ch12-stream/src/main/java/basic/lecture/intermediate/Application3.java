package basic.lecture.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        /*
        * sorted(Comparator)
        * 스트림에 담긴 데이터를 정렬해서 반환
        * */

        List<Integer> integerList = IntStream.of(5,20,99,2,4,6)
                .boxed()
                //.sorted()
                // 각 정수를 Integer 형태로 변환
                .sorted(Comparator.reverseOrder())
                .toList(); //리스트로 변환

        System.out.println("integerList : " + integerList);
    }
}
