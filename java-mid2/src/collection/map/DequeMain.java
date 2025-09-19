package collection.map;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> dq2 = new LinkedList<>();

        dq.offerFirst(1);
        System.out.println(dq);

        dq.offerFirst(2);
        System.out.println(dq);

        dq.offerLast(3);
        System.out.println(dq);

        dq.offerLast(4);
        System.out.println(dq);
        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + dq.peekFirst());
        System.out.println("deque.peekLast() = " + dq.peekLast());
        // 데이터 꺼내기
        System.out.println("pollFirst = " + dq.pollFirst());
        System.out.println("pollFirst = " + dq.pollFirst());
        System.out.println("pollLast = " + dq.pollLast());
        System.out.println("pollLast = " + dq.pollLast());
        System.out.println(dq);
    }
}
