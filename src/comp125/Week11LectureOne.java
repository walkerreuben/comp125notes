package comp125;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by reuben on 10/29/14.
 */
public class Week11LectureOne {

    public static int evaluate(String expression) {

        MyStack stack = new MyStack();

        String[] words = expression.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo("+") == 0) {
                int arg1 = stack.pop();
                int arg2 = stack.pop();
                stack.push(arg1 + arg2);
            }
            else if (words[i].compareTo("*") == 0) {
                int arg1 = stack.pop();
                int arg2 = stack.pop();
                stack.push(arg1 * arg2);
            }
            else if (words[i].compareTo("-") == 0) {
                int arg1 = stack.pop();
                int arg2 = stack.pop();
                stack.push(arg1 - arg2);
            }
            else if (words[i].compareTo("/") == 0) {
                int arg1 = stack.pop();
                int arg2 = stack.pop();
                stack.push(arg1 / arg2);
            }
            else{
                int value = Integer.parseInt(words[i]);
                stack.push(value);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        String exp1 = "3 4 5 + *";

        System.out.println(exp1 + " = " + evaluate(exp1));

        Deque<Integer> ss = new LinkedList<Integer>();

        ss.push(12);
        ss.push(3);
        System.out.println(ss);

    }

}
