package basic.ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 93;

        if(score<90){
            System.out.println("점수가 90보다 작습니다. \n등급은 B입니다");
        }
        if(score>90){
            System.out.println("점수가 90보다 큽니다. \n등급은 A입니다");
        }
    }
}
