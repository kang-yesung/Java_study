package basic.ch04.sec02;

import java.util.Random;

public class IfNestedExample {
    public static void main(String[] args) {

        Random rand = new Random();

        int score = rand.nextInt(20) + 81;
        System.out.println("점수: " + score);

        if(score>=95){
            System.out.println("학점: A+");
        }else if (score>=90){
            System.out.println("학점: A");
        } else if (score>=85) {
            System.out.println("학점: B+");
        } else {
            System.out.println("학점: B");
        }
    }
}
