package advanced;

import java.util.Scanner;

public class ForExample7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;

        while (true){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 ㅣ 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택>");
            int n =scanner.nextInt();
            if (n ==1){
                System.out.print("예금액>");
                int a = scanner.nextInt();
                amount += a;
            } else if(n==2){
                System.out.print("출금액>");
                int a = scanner.nextInt();
                if(amount < a){
                    System.out.println("잔고가 부족합니다");
                    System.out.println("올바른 금액을 입력해주세요");
                } else {
                    amount -= a;
                }
            } else if(n==3){
                System.out.println("잔고>"+ amount);

            } else if (n ==4) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바르지 않는 항목 입니다, 다신 선택해주세요");
            }

        }
    }
}
