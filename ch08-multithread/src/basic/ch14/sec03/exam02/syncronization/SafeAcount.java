package basic.ch14.sec03.exam02.syncronization;

public class Acount {

    //공유자원 : 여러 스레드가 동시에 접근할 수 있는 데이터(공용으로 사용하는 자원)
    private  int balance = 10000;

    public  void withdraw(int money){

        //임계영역 : 반드시 한번에 한스레드만 실행되어야 데이터 꼬임을 방지
        if(balance>=money){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
            balance -= money;
        }
    }

    public int getBalance() {
        return balance;
    }
}
