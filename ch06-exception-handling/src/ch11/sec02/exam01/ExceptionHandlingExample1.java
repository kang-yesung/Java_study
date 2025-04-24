package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        // 정보를 문자열이 아닌 null 값을 전달해서 오류
        // .length()를 호출하려 할 때 오류가 발생함 (null은 객체가 아니므로)
        System.out.println("[프로그램 종료]");
    }

}
