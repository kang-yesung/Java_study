package basic.ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum= 0;
        int i = 1;
        while (true){
           if(i <= 100){
           sum += i;
           i++;
           }
           if(i>100){
               System.out.println("1~100 합 : " + sum);
               break;
           }
        }
    }
}
