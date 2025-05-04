package hw.controoler;

import hw.model.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
        bookList.add(new BookDTO("132343323", 2, "자바", "강예성"));
        bookList.add(new BookDTO("133433433", 1, "HTMl", "강예성"));
        bookList.add(new BookDTO("243243234", 3, "집밥", "강예성"));
    }

    public void addBook(BookDTO book){
        bookList.add(book);
        System.out.println("도서가 추가되었습니다");
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public int searchBook(String title){
        int index = -1;
        for (int i = 0; i< bookList.size(); i++){
            if(bookList.get(i).getTitle().contains(title)){
                return index = i;
            }
        }
        return index;
    }

    public void printBook(int index){
        if (index>=0) {
            System.out.println(bookList.get(index));
        } else {
            System.out.println("검색된 도서가 없습니다");
        }
    }

    public void displayAll(){
        if (!bookList.isEmpty()) {
            for (int i = 0; i < bookList.size(); i++){
                System.out.println(i+"번: "+ bookList.get(i));
            }
        } else {
            System.out.println("도서3 리스트가 없습니다");
        }
    }

}
