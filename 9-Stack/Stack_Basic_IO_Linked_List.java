import java.util.ArrayList;

public class StackBasicIOArrayList {
  // Stack implementation using Arraylist
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        while (!stk.isEmpty()) {
            System.out.println(stk.peek() + "\n");
            stk.pop();
        }
    }
}
