package com.ohgiraffers.hw1.model.dto;


public class EmployeeDTO extends PersonDTO {
    int salary;
    String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double heoght, double weight, int salary, String dept) {
        this.salary = salary;
    }
    public String inpormation(){
        return "이름: " + name + "나이" + age + "신장" + height + "몸무게" + weight + "급여" + salary + "부서" + dept;
    }
}
