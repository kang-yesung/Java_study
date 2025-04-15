package basic.ch04.sec05;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        int i =1;

        while (true){
            if(i <=10){
                System.out.print(i+" ");
                i++;
            }
            if(i >10 ){
                break;
            }
        }
    }
}
