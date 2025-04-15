package basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i =2; i<=9; i++){
            System.out.println("***" + i +"단 ***");
            for (int z = 1; z<=9; z++){
                System.out.println(i + " X " + z + " = " + (i*z));
            }
        }
    }
}
