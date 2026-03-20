package Assignment4.Module11;

import java.util.Collections;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Collections.reverse(stack);
        System.out.println(stack);
    }
}
