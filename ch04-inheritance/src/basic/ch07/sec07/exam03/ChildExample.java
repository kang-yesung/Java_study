package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3();
        // parent에 new child를 하게 되면 오버라이딩 하게 되면서 child 에 있는 method3이 없어지기때문에 오류가 발생한다

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
