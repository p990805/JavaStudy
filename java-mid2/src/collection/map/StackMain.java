package collection.map;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);

        System.out.println("stack.peek() = " + st.peek());
        System.out.println("st.pop() = " + st.pop());
        System.out.println("st.pop() = " + st.pop());
        System.out.println("st.pop() = " + st.pop());
        System.out.println(st);
    }
}
