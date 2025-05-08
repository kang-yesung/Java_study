package advanced.ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

//        DoubleStream doubleStream = Arrays.stream(intArray).asDoubleStream();
//        doubleStream.forEach(s-> System.out.println(s));

        Arrays.stream(intArray).asDoubleStream().forEach(s-> System.out.println(s));

        System.out.println("-------------------------");

//        IntStream intStream = Arrays.stream(intArray);
//        intStream.forEach(s-> System.out.println(s));
        Arrays.stream(intArray).forEach(s-> System.out.println(s));

    }
}
