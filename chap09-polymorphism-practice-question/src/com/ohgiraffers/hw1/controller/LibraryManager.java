package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Arrays;

public class LibraryManager {
    Member mem = null;
    Book[] bList = new Book[5];

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }



    public  LibraryManager(){
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem){
        this.mem = mem;
    }

    public Member myInfo(){
        return mem;
    }

    public Book[] selectAll(){
        Book[] blist = this.bList;
        return blist;
    }

    public Book[] searchBook(String keyword){
        Book[] sb = new Book[5];
        for(int i = 0; i< 5; i++){
            if(bList[i].getTitle().contains(keyword) ){
                sb[i] = bList[i];
            }
        }


        return sb;
    }

    public int rentBook(int index){
        int result = 0;
        Book book = bList[index];
        if(book instanceof AniBook){
            AniBook aniBook = (AniBook) book;
            if(mem.getAge()<aniBook.getAccessAge()){
                result++;
            }
        } else {
            CookBook cookBook = (CookBook) book;

            if(cookBook.isCoupon()){
                result=2;
                mem.setCouponCounter();
            }
        }
        return result;
    }

}
