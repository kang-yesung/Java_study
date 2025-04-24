package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long Start = System.nanoTime();
        int sum = 0;
        for(int i =1; i<=1000000; i++){
            sum+=i;
        }
        Long End = System.nanoTime();

        System.out.println(End - Start);
    }
}
