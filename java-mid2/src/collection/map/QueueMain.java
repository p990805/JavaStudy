package collection.map;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
          Queue<Integer> q = new ArrayDeque<>();
//        Queue<Integer> q = new LinkedList<>();

        //데이터 추가
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());

        System.out.println("poll = " + q.poll());
        System.out.println("poll = " + q.poll());
        System.out.println("poll = " + q.poll());
        System.out.println(q);
    }
}
