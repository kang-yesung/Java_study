package advanced.ch15.sec05.exerise;


public class Student implements Comparable<Student> {
    private int num;
    private String name;
    private  String mail;
    private  String gitUrl;

    public Student(int num, String name, String mail, String gitUrl) {
        this.num = num;
        this.name = name;
        this.mail = mail;
        this.gitUrl = gitUrl;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    //번호 순 정렬
//    @Override
//    public int compareTo(Student o) {
//        if(this.num < o.num) return -1;
//        else if (this.num == o.num) return 0;
//        else return  1;
//    }

   //이름 정렬
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }

    //메일 정렬
//    @Override
//    public int compareTo(Student o) {
//        return this.mail.compareTo(o.mail);
//    }

    //git 정렬
    @Override
    public int compareTo(Student o) {
        return this.gitUrl.compareTo(o.gitUrl);
    }



}
