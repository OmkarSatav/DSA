public class LinkedListBasics {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

  
  // Reverse the Linked List
    public void reverseLL() {
        Node curr = tail = head;
        Node prev = null, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    public static void main(String[] args) {
        LinkedListBasics l1 = new LinkedListBasics();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        l1.printLL();


        System.out.println("\nReverse Linked lis : ");
        l1.reverseLL();
        l1.printLL();
    }
}
