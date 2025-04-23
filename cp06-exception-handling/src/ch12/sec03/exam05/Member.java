package ch12.sec03.exam05;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Member {
    private String id;
    private String name;
    private int age;
}
