package advanced;

import java.util.Scanner;

public class ForExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n; i> 0; i--){
            for (int j = 0; j<= i-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
