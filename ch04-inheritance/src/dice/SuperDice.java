package dice;

import java.util.Random;

public class SuperDice extends Dice{
    int min;
    int max;

    public SuperDice() {
        min = 1;
        max = 10;
    }

    @Override
    public int getNumber(){
        Random random = new Random();
        int num = random.nextInt(max-min+1)+min;
        return num;
    }

    /*
    * - `Dice` 클래스를 상속받은 클래스
- `min`, `max` 필드를 가짐
- 기본 생성자를 통해 `min = 1`, `max = 10`으로 초기화됨
- `getNumber()`는 **min 이상 max 이하의 랜덤 숫자**를 반환
    * */
}
