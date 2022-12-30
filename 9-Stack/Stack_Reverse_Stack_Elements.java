import java.util.*;

public class Stack_Reverse_Stack_Elements {
    public static void pushAtBottom(Stack<Integer> stk, int data) {
        if (stk.isEmpty()) {
            stk.push(data);
            return;
        }
        int top = stk.pop(); // Removes Top element at each recursion.
        pushAtBottom(stk, data); // Push element when stack is empty
        stk.push(top); // push removed element in reverse order.
    }

    public static void reverseStack(Stack<Integer> stk) {
        if (stk.isEmpty()) {
            return;
        }
        int top = stk.pop(); // Removes Top element at each recursion. - Stack is emptied using this and next
                             // step
        reverseStack(stk);
        pushAtBottom(stk, top); // top element in recursion are pushed at bottom.
    }

    public static void printStack(Stack<Integer> stk) {
        while (!stk.isEmpty()) {
            System.out.println("Stack Top : " + stk.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        // 4 3 2 1
        // printStack(stk);

        System.out.println("Stack elements are reversed");

        reverseStack(stk);
        printStack(stk);
    }
}
