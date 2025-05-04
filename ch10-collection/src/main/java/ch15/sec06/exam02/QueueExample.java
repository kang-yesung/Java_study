package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> que = new LinkedList<>();
        que.offer(new Message("sendMail", "홍길동"));
        que.offer(new Message("sendSMS", "신용권"));
        que.offer(new Message("sendKakaotalk", "감자바"));

        while (!que.isEmpty()){
            Message msg = que.poll();
            switch(msg.command){
                case "sendMail":
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(msg.to + "에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(msg.to + "에게 카카오톡를 보냅니다.");
            }
        }
    }
}
