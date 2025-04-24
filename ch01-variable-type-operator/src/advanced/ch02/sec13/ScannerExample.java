package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        while (true){
            System.out.print("입력 문자열: ");
            String str = scanner.nextLine();
            if(str.equals("q")){
                System.out.println("종료");
                break;
            }
            System.out.println("출력 문자열: "+ str);
            System.out.println("");
        }

        
        scanner.close();

    }
}
