package com.ohgiraffers.hw1.model.dto;


public class EmployeeDTO extends PersonDTO {
    int salary;
    String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String inpormation(){
        return "이름: " + getName() + " 나이: " + age + " 신장: " + height + " 몸무게: " + weight + " 급여: " + salary + " 부서: " + dept;
    }
}
