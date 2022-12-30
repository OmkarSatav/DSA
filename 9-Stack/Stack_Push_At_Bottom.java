import java.util.*;

public class StackPushAtBottom {
    public static void pushAtBottom(Stack<Integer> stk, int data) {
        if (stk.isEmpty()) {
            stk.push(data);
            return;
        }
        int top = stk.pop(); // Removes Top element at each recursion.
        pushAtBottom(stk, data); // Push element when stack is empty
        stk.push(top); // push removed element in reverse order.
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();

        stk.push(1);
        stk.push(2);
        stk.push(3);

        pushAtBottom(stk, 4);

        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
