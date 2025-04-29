package advanced.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();

        for(int i= 0; i<5; i++){
            list.add(new Board("subject"+(i+1), "content" + (i+1), "writer"+(i+1)));
        }

        System.out.println(list.size()+"개");

        System.out.println("================");

        System.out.println(list.get(2));

        System.out.println("================");

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("===============");

        list.remove(2);
        list.remove(2);

        for(Board i : list){
            System.out.println(i);
        }
    }
}
