package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        /*
        * 문자열을 특정 구분자오 하여 문장열을 반환하는 기능
        * 1. split() : 정규표햔식을 이용해 반환하는 가능
        *              비정형화된 문자열을 분리할 떄 좋음 (공백 문자열 값 표현)
        *
        * 2. StringTokenizer : 문자열의 모든 순서들을 구분자로 하여 문자열 분리
        *                      전형화된 문자열 패턴을 분리할때 좋음 (공백 문자열 분리)
        *                      split()보다 속도면에서 빠름
        * */

        String emp1 = "100,홍길동,서울,영업부";
        String emp2 = "200,유관순,,총무부";
        String emp3 = "300,이순신,경기도,";
//        compareSplitAndTokenizer("emp1", emp1);
        compareSplitAndTokenizer("emp2", emp2);
//        compareSplitAndTokenizer("emp3", emp3);


    }
    public static void compareSplitAndTokenizer(String label, String data){
        System.out.println("=================" + label + " 비교 =================");
        //split() 사용
        String[] splitResult = data.split(",",-1);//빈 문자열도 포함
        System.out.println("[split()] 결과 : " + Arrays.toString(splitResult));

        //StringTokenizer 사용
        StringTokenizer tokenizer = new StringTokenizer(data, ",");
        System.out.println("[StringTokenizer()] 결과 : ");
        while (tokenizer.hasMoreTokens()){
            System.out.println("token : " + tokenizer.nextToken());
        }
    }
}
