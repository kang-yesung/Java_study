package basic.ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = { "홍길동", "신용권", "김미나"};
        Stream<String> stream1 = Arrays.stream(strArray);

        stream1.forEach(str-> System.out.print(str + ","));
        System.out.println();

        int[] intArray = { 1, 2, 3, 4, 5 };

        IntStream stream2 = Arrays.stream(intArray);
        stream2.forEach(n-> System.out.print(n + ","));
    }
}
