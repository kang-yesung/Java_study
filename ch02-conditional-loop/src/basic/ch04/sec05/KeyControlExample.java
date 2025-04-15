package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1. 증속| 2. 감속| 3. 중지");
            System.out.println("-----------------------------");

            System.out.print("선택: ");
            int n = scanner.nextInt();
            if(n==1){
                speed++;
                System.out.println("현제속도 = " + speed);
            }
            if (n==2){
                speed--;
                System.out.println("현재속도 = " + speed);
            }
            if (n==3){
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
