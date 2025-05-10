package lecture;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pharmacy> pharmacies = PharmacyCsvReader.readCSv("약국목록.csv");

//        for(Pharmacy p : pharmacies){
//            System.out.println(p);
//        }

        // 경기에 위치한 약국의 갯수구하기
        // 전화번호 필드가 빈 약국만 걸러내기
        // 개설 날짜가 2025 년도인 약구만 조회하기

        List<Pharmacy> filteredPharmay = pharmacies.stream()
                .filter(p-> "경기".equals(p.getCityName()))
                .filter(p-> p.getPhone().isBlank())
                .filter(p-> p.getOpenDate() != null && p.getOpenDate().startsWith("2025"))
                .toList();

        long count = filteredPharmay.stream()
                        .count();
        filteredPharmay.forEach(System.out::println);
        System.out.println(count);

    }
}
