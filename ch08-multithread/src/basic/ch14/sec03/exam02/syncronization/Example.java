package basic.ch14.sec03.exam02.syncronization;

public class Example {
    public static void main(String[] args) {
//        Acount acount = new Acount();
        SafeAcount acount = new SafeAcount();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                acount.withdraw(1000);
                System.out.println("Thread1 출금 후 잔액: " + acount.getBalance());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                acount.withdraw(1000);
                System.out.println("Thread2 출금 후 잔액: " + acount.getBalance());
            }
        });

        t1.start();
        t2.start();

    }
}
