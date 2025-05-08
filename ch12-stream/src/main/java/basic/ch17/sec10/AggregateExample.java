package basic.ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4 ,5};

        long countInteger = Arrays.stream(arr)
                .filter(n -> n %2==0)
                .count();
        System.out.println("2의 배수 개수:" + countInteger);

        int sumInteger = Arrays.stream(arr)
                .filter(n -> n %2==0)
                .sum();
        System.out.println("2의 배수의 합:" + sumInteger);

        double averageInteger = Arrays.stream(arr)
                .filter(n -> n %2==0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수의 평균:" + averageInteger);

        int maxInteger = Arrays.stream(arr)
                .filter(n -> n %2==0)
                .max()
                .getAsInt();
        System.out.println("2의 배수의 최대값:" + maxInteger);

        int minInteger = Arrays.stream(arr)
                .filter(n -> n %2==0)
                .min()
                .getAsInt();
        System.out.println("2의 배수의 최소값:" + minInteger);

        int integer = Arrays.stream(arr)
                .filter(n-> n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수:" + integer);
    }
}
