package hw.view;

import hw.controoler.BookManager;
import hw.model.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu(){
    }

    public void menu(){
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색 출력");
            System.out.println("4. 전체 출력");
            System.out.println("5. 끝내기");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1:
                    System.out.println("1. 새 도서 추가");
                    inputBook();
                    break;
                case 2:
                    bm.displayAll();
                    System.out.println("삭제할 도서의 인덱스를 입력해 주세요");
                    int index = sc.nextInt();
                    bm.deleteBook(index);
                    break;
                case 3:
                    System.out.println("3. 도서 검색 출력");
                    String title = inputBookTilte();
                    bm.printBook(bm.searchBook(title));
                    break;
                case 4:
                    bm.displayAll();
                    break;
                case 5:
                    System.out.println("프로그램을 종료하시겠습니까?");
                    System.out.print("y/n : ");
                    String str = sc.nextLine();
                    str = str.toLowerCase();
                    if(str.equals("y")){
                        System.out.println("프로그램을 종료 합니다");
                        return;
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다");
                    break;
            }
        }


    }
        public BookDTO inputBook(){
            String bNo = "";
            while (true) {
                System.out.println("도서 번호 : ");
                bNo = sc.nextLine().replaceAll("[^0-9]", "");
                if(bNo.length() == 13){
                    break;
                }
                System.out.println("올바른 번호를 입력해 주세요");
            }


            String title = "";
            while (true){
                System.out.println("도서 제목 : ");
                title = sc.nextLine().trim();
                if (!title.isEmpty()){
                    break;
                }
                System.out.println("제목을 입력해 주세요");
            }
            int category;

            while (true){
                try {
                    System.out.println("도서 장르 1: 인문 / 2:자연과학 / 3:의료 / 4:기타 ");
                    category = Integer.parseInt(sc.nextLine());
                    if(category >=1 && category <=4) break;
                    System.out.println("올바른 숫자를 입력해 주세요");
                } catch (NumberFormatException e) {
                    System.out.println("올바른 장르 번호를 입력하세요");
                }
            }


            String author = "";
            while (true) {
                System.out.println("도서 저자 : ");
                author = sc.nextLine().trim();
                if(!author.isEmpty()){
                    break;
                }
                System.out.println("저자를 입력해 주세요");
            }


            BookDTO bt = new BookDTO(bNo, category, title, author);
            bm.addBook(bt);
            return  bt;
        }

        public String inputBookTilte(){
        String title = sc.nextLine();
        return title;
        }
}
