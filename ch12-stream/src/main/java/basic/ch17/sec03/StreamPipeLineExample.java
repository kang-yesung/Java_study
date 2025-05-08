package basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );
        //1. 단계별로 변수에 담아 처리

        //1) List<Student> -> Stream<Student> 로 변환
        Stream<Student> studentStream = list.stream();

        // 2)Student의 score만 추출
        IntStream scoreStream = studentStream
                .mapToInt(s -> s.getScore());

        //Stream은 한버만 사용 가능
//        IntStream scoreStream2 = studentStream
//                .mapToInt(s -> s.getScore());

        //3) 평균을 계산 (average()) 하고 Optional에서 double 값을 꺼냄
        double avg1 = scoreStream
                .average() //평균을 계산 OptionalDouble 반환
                .orElseThrow(() -> new RuntimeException("점슈가 없음"));

        System.out.println(avg1);

        //파이프라인스타일 (cp이닝)
        double avg2 = list.stream()
                .mapToInt(s -> s.getScore())
                .average()
                .orElse(0.0);

        System.out.println("평균점수 : " + avg2);

        //stream 합치기
        Stream<Student> studentStream1 = list.stream();
        Stream<Student> studentStream2 = Stream.of(
                new Student("세종", 40),
                new Student("광종", 30)
        );

        Stream<Student> concatStudent = Stream.concat(studentStream1, studentStream2);

        concatStudent.forEach(student -> System.out.println(student));
    }
}
