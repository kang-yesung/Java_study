package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    int grade;
    String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight ,int grade, String major) {
        super(age, height, weight);
        this.grade = grade;
        this.major = major;

        setName(name);
    }


    @Override
    public String inpormation(){
        return "이름: " + getName() + " 나이: " + age + " 신장: " + height + " 몸무게: " + weight + " 학년: " + grade + " 전공: " + major;
    }


}
