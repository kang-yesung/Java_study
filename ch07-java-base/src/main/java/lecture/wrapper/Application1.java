package lecture.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /*
         *  기본타입        래퍼클래스
         *  byte          Byte
         *  short         Short
         *  int           Integer
         *  long          Long
         *  float         Float
         *  double        Double
         *  char          Character
         *  boolean       Boolean
         * */
        /*
         * 박싱 과 언박싱
         * 박싱 : 기본타입을 래퍼클래스의 인스턴스로 인슨턴스화 하는거
         * 언박싱 : 래퍼클래스의 인스턴스를 가본타입으로 바꾸는 것
         * */

        int intValue = 10;
        //박싱
//    Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber1 = intValue;

        Integer boxingNumber1a = Integer.valueOf(intValue);

        int unBoxingNUmber1 = boxingNumber1; //오토 언박싱

        System.out.println(unBoxingNUmber1);

        // ==
        Integer num1 = 10;
        Integer num2 = 10;
        int num3 = 10;

        System.out.println("Integer 와 Integer 비교 : " + (num1 == num2));
        System.out.println("int 와 Integer 비교 : " + (num1 == num3));


    }
}
