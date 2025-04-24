package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        //Date 연도 설정 문제
        Date legacyDAte = new Date();
        legacyDAte.setYear(2025);
        System.out.println("Date setYear(2025) -> 실제 출력" + legacyDAte); //1900 + 되서 출력

        // Calendar 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println("Calaender.set(2025.04,25) -> 실제 월 : " + cal.getTime());
    }
}
