package com.ohgiraffers.hw1.model.dto;

public class Member {
    String name;
    int age;
    char gender;
    int couponCounter;

    public Member() {
    }

    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCouponCounter() {
        return couponCounter;
    }

    public void setCouponCounter() {
        couponCounter++;
    }

    @Override
    public String toString() {
        return "이름: " + name + " ,나이: " +  age + " ,성별: " + gender + " ,쿠폰: " + couponCounter;
    }
}
