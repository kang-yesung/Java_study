package lecture.dto;

//Data Transfer Object
//-> 데이터 전달용 객체

import lombok.*;

@NoArgsConstructor //매개변수없는 생성자
@AllArgsConstructor //모든필드를 매개변수로 받는 생성자
//@RequiredArgsConstructor // final, notnull 이 붙은 필드가 있으면 이 필드만 초기화 시키는 생성지
@ToString //오버리이딩
@Getter
@Setter
// @Data -> RequiredArgsConstructor, Getter, Setter, @toString .. 다 합친것
public class StudentDTO {

//    @NonNull
    private String name;
    private int age;
    private String email;


}
