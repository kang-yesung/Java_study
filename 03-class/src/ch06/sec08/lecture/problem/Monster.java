package ch06.sec08.lecture.problem;

public class Monster {
    /*
    * 접슨제어자
    * - 클래스 혹은 클레스의 멤버에 참조연산자로 접근 할 수 있는 범위를 제어하기 위한 키워드
    * 1. public : 모든 패키지에서 접근 가능
    * 2. protected : 동일한 패기지에 접근 가능 (ㄱ단, 상속관계에서 있으면 다른 페키지에서도 접근 가능)
    * 3. default : 동일 패키지에서민 접근 가능
    * 4. private : 해당 클래스 내부에서만 접근 가능
    *
    * 예외
    * 클래스 선언시 사용하는 접근제어자는 public / default 두가지만 사용
    * */

    //private 해당 클래스의 내부에서만 접근 가능
    private String kinds;
    private int hp;

    //Getter
    //값을 인스턴스에서 꺼내기 위해 사용하는 메서드
    public String getKinds() {
        return this.kinds;
    }

    public int getHp() {
        return this.hp;
    }

    //setter
    //인스턴스의 멤버 값을 설정하기 위해 사용하는 메서드


    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public void setHp(int hp) {
        // 0이하로 바뀌면 x
        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
}
