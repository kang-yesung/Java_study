package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm;
    Scanner sc;

    public LibraryMenu() {
        lm = new LibraryManager();
        sc = new Scanner(System.in);
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void mainMenu(){
        System.out.print("이름을 입력해주세요");
        String name = sc.nextLine();

        System.out.print("나이를 입력해주세요");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별을 입력해 주세요");
        char gender = sc.nextLine().charAt(0);

        Member m = new Member(name, age, gender);
        lm.insertMember(m);

        while (true) {
            System.out.println();
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료");
            System.out.println();

            System.out.println("메뉴를 선택해 주세요");
            System.out.print("> ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num){
                case 1:
                    Member my = lm.myInfo();
                    System.out.println(my);
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("올바른 항목을 선택해 주세요");
                    break;
            }
        }
    }

    public void selectAll(){
       Book[] bList = lm.selectAll();
        for (int i=0; i<5; i++){
            if(bList[i]!=null){
                System.out.println(i+ "번도서" + " / " + bList[i] );
            }
        }
    }

    public void searchBook(){
        System.out.println("검색할 제목 키워드를 입력해주세요");
        String str = sc.nextLine();
        Book[] searchList = lm.searchBook(str);
        for(Book i : searchList){
            if(i !=null){
                System.out.println(i);
            }
        }

    }

    public void rentBook(){
        selectAll();
        System.out.println("대여할 책의 번호를 입력해 주세요");
        System.out.print("> ");
        int i = sc.nextInt();
        int result = lm.rentBook(i);

        if(result==0){
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result==1){
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.마이페이지를 통해 확인하세요");
        }

    }
}
