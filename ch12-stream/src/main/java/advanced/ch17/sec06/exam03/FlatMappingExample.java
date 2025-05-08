package advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        //문장 스트림을 단어 스트림으로 변환 후 출력
        Stream<String> str1 = list1.stream().flatMap(s-> Arrays.stream(s.split(" ")));
        str1.forEach(System.out::println);

        System.out.println("---------------------");

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        //문자열 숫자 목록 스트림을 숫자 스트림으로 변환 후 출력
        Stream<String> str2 = list2.stream()
                .flatMap(s->Arrays.stream(s.split(",\\s*")));
        IntStream intStream = str2.mapToInt(s->Integer.parseInt(s));
        intStream.forEach(System.out::println);
    }
}
