package basic.ch04.sec06;
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

            System.out.println("메시지를 입력하세요");
            System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        do {
            System.out.print(">");
            input = scanner.nextLine();
            System.out.println(input);
        } while (!input.equals("q"));

        System.out.println("프로그램 종료");

    }
}
