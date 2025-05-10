package lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PharmacyCsvReader {

    public static List<Pharmacy> readCSv(String filePath) {

        //list 생성
        List<Pharmacy> pharmacies = new ArrayList<>();

        // BufferedReader -> 보조스트림
        // FileReader

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            boolean isFirstLine = true;

            while ((line =  br.readLine()) != null){

                //첫줄 (헤더)무시
                if(isFirstLine){
                    isFirstLine = false;
                    continue;
                }

                // 문자열 배열
                String[] field = pardeCsvLine(line);
//                System.out.println("field = " + Arrays.toString(field));
                if(field.length < 14){
                    System.out.println("잘못된 라인" + line);
                    continue;
                }

                pharmacies.add(new Pharmacy(field));

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return pharmacies;
    }

    private static String[] pardeCsvLine(String line) {

        List<String> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        //큰따옴표 상태
        boolean inQoutes = false;

        for(int i = 0; i < line.length(); i++){
            char c = line.charAt(i);

            if(c == '"'){
                inQoutes = !inQoutes; //큰따옴표 상태 반전

                // 문자가 , 일때 && inQoutes가 true가 아닐때
            } else  if(c == ',' && !inQoutes){

                // sb(StringBuilder)에 쌓인 문자를 문자열로 변환
                result.add(sb.toString().trim());
                sb.setLength(0); //문자열을 빼낸 뒤 초기화

                // 나머지 문자일때
            }  else {
                sb.append(c);
            }


        }
        //마지막 필드 추가
        result.add(sb.toString().trim());

        return result.toArray(String[]::new);
    }
}
