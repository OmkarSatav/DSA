import java.util.*;

public class StackFramework {

    // Stack Framework used to implement explicit Stack
    // method name - push, pop, peek
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        while (!stk.isEmpty()) {
            System.out.println("Stack Top : " + stk.peek());
            stk.pop();
        }
    }
}
