package exam02;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderAnalysis {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", "전자제품", 1200000);
        Product phone = new Product("스마트폰", "전자제품", 800000);
        Product book = new Product("자바 책", "도서", 30000);
        Product headphone = new Product("헤드폰", "전자제품", 120000);
        Product tablet = new Product("태블릿", "전자제품", 500000);
        Product charger = new Product("충전기", "액세서리", 25000);

        // 주문 목록 생성
        List<Order> orders = Arrays.asList(
                new Order(1, "김철수", Arrays.asList(laptop, headphone), LocalDate.of(2023, 3, 15)),
                new Order(2, "이영희", Arrays.asList(phone, charger), LocalDate.of(2023, 4, 20)),
                new Order(3, "박민수", Arrays.asList(book, tablet), LocalDate.of(2023, 5, 10)),
                new Order(4, "최지원", Arrays.asList(laptop, phone, charger), LocalDate.of(2023, 5, 22)),
                new Order(5, "김철수", Arrays.asList(tablet, book), LocalDate.of(2023, 6, 5))
        );

        // 1. 총액이 100만원 이상인 주문의 ID 목록을 반환하기
        System.out.println("1. 총액이 100만원 이상인 주문의 ID 목록을 반환하기");
        List<Integer> result1 = orders.stream()
                        .filter(o -> o.getTotalAmount() > 1000000)
                                .map(o-> o.getOrderId())
                                        .collect(Collectors.toList());
        System.out.println("총액 100만원 이상 주문 ID: " + result1);
        System.out.println();

        //2. 각 고객별 총 주문 금액을 계산하여 맵으로 반환하기
        System.out.println("2. 각 고객별 총 주문 금액을 계산하여 맵으로 반환하기");
        Map<String, Double> result2 = orders.stream()
                        .collect(Collectors.groupingBy(
                                o -> o.getCustomerName(),
                                Collectors.summingDouble(o -> o.getTotalAmount())
                        ));
        System.out.println("고객quf 총 주문 금액: " + result2);
        System.out.println();

        // 3. 모든 주문에서 가장 많이 구매된 제품 카테고리를 찾기
        System.out.println("3. 모든 주문에서 가장 많이 구매된 제품 카테고리를 찾기");
        String result3 = orders.stream()
                        .flatMap(o-> o.getProducts().stream())
                                .collect(Collectors.groupingBy(
                                        product -> product.getCategory(),
                                        Collectors.counting()
                                ))
                                        .entrySet().stream()
                        .max((e1, e2)-> Long.compare(e1.getValue(), e2.getValue()))
                                .map(p-> p.getKey())
                                        .orElse("없음");
        System.out.println("가장 많이 구매한 카테고리: " + result3);
        System.out.println();

        // 4. 2023년 5월 이후의 주문에서 구매된 모든 제품의 이름을 중복 없이 반환하기
        System.out.println("4. 2023년 5월 이후의 주문에서 구매된 모든 제품의 이름을 중복 없이 반환하기");
        List<String> result4 = orders.stream()
                        .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2023,4,30)))
                                .flatMap(o -> o.getProducts().stream())
                                        .map(p->p.getName())
                                                .distinct()
                                                        .collect(Collectors.toList());

        System.out.println("5월 이후 구매한 제품: " + result4);
        System.out.println();

        // 5. 각 제품 카테고리별 평균 가격을 계산하기
        System.out.println("5. 각 제품 카테고리별 평균 가격을 계산하기");
        Map<String, Double> result5 = orders.stream()
                        .flatMap(o-> o.getProducts().stream())
                                .collect(Collectors.groupingBy(
                                        p-> p.getCategory(),
                                        Collectors.averagingDouble(p->p.getPrice())
                                ));
        System.out.println("카테고리별 평균 가격: " + result5);
        System.out.println();

        // 6. 모든 주문을 날짜별로 그룹화하고, 각 날짜의 총 주문 금액을 계산하기
        System.out.println("6. 모든 주문을 날짜별로 그룹화하고, 각 날짜의 총 주문 금액을 계산하기");
        Map<LocalDate, Double> result6 = orders.stream()
                        .collect(Collectors.groupingBy(
                                o-> o.getOrderDate(),
                                Collectors.summingDouble(o->o.getTotalAmount())
                        ));
        System.out.println("날짜별 총 주문 금액: " +  result6);


    }
}
