package lecture.book;

public class Application {
    public static void main(String[] args) {

        Book mybook = new Book();
        mybook.title= "해리포터와 마버사의 돌";
        mybook.author = "조엔 K 롤링";
        mybook.coverType = "하드커버";
        mybook.pageCount = 320;

        //제목을 해리포터와 혼혈왕자
        Book mybook2 = new Book();
        mybook2.title= "해리포터와 혼혈왕자";
        mybook2.author = "조엔 K 롤링";
        mybook2.coverType = "하드커버";
        mybook2.pageCount = 320;

        mybook.getTitle();
        mybook2.getTitle();

        System.out.println(mybook2.toString());

        Book myBook3 = new Book("조엔 K 롤링", "해리포터와 비밀의방", "하드케이스", 320);
        System.out.println(myBook3);

        Book mybook4 = new Book("조엔 K 롤링", "해리포터와 아즈카반의 죄수");
        System.out.println(mybook4);


    }
}
