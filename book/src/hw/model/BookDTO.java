package hw.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class BookDTO {
    private  String bNO; //도서 번호
    private int category; //도서분류코드
    private String title; //도서 제목
    private String author; //도서 저자

    @Override
    public String toString() {
        return "도서번호: " + bNO + ", 도서 분류 코드: " + category + ", 제목: " + title + ", 작가: " + author;
    }
}
