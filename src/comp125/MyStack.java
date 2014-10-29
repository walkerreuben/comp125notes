package comp125;

import java.util.LinkedList;

/**
 * Created by reuben on 10/29/14.
 */
public class MyStack {

    LinkedList<Integer> stack;

    public MyStack() {
        stack = new LinkedList<Integer>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        return stack.removeLast();
    }

    public int peek() {
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }



}
