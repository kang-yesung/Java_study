package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    int grade;
    int major;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int major) {
        this.grade = grade;
        this.major = major;
    }

    public String inpormation(){
        return "이름: " + name + "나이" + age + "신장" + height + "몸무게" + weight + "학년" + grade + "전공" + major;
    }


}
