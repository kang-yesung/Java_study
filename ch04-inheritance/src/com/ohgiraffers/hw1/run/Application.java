package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDTO[] student = {
                new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
                new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
                new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신학과")};


        for(StudentDTO i : student){
            System.out.println(i.inpormation());
        }
        System.out.println();

        EmployeeDTO[] employee = new EmployeeDTO[10];
        int count = 0;
        while (true){
            if (count<10) {
                System.out.println("사원 정보를 입력하세요");
                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("나이를 입력하세요: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("신장 입력하세요: ");
                double height = scanner.nextDouble();
                scanner.nextLine();


                System.out.print("몸무게를 입력하세요: ");
                double weight = scanner.nextDouble();
                scanner.nextLine();


                System.out.print("급여를 입력하세요: ");
                int salary = scanner.nextInt();
                scanner.nextLine();


                System.out.print("부서를 입력하세요: ");
                String dept = scanner.nextLine();

                employee[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
                count++;

                System.out.println("사원 정보를 더 입력하시겠습니까\n더 입력하시려면 y, Y 하나를 입력해 주세요");
                String str = scanner.nextLine();
                if(!str.equals("y") && !str.equals("Y")){
                    System.out.println("사원 정보 입력을 종료합니다");
                    break;
                }
            } else {
                System.out.println("더이상 사원 정보를 입력할 수 없습니다");
            }
        }

        for(int i = 0; i< count; i++){
            System.out.println(employee[i].inpormation());
        }

        // 2번 : 사원정보를 입력받고 기록 할 수 있게 하세요
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력
    }
}
