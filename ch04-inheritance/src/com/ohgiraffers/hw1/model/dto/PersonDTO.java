package com.ohgiraffers.hw1.model.dto;

public abstract class PersonDTO {
    protected String name;
    int age = 0;
    double height;
    double weight;

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String information(){
        return name + " " +  age + " " + height + " " + weight;
    }

    public abstract String inpormation();
}
