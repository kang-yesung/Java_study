package dice;

public class HellDice extends Dice{
    @Override
    public int getNumber() {
        return 4;
    }

    /*- `Dice` 클래스를 상속받은 클래스
- `getNumber()`는 **항상 4를 반환***/
}
