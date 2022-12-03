   
public class Reverse_LinkedList {
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

  
  // Linked List has Cycle
    public boolean hasCycle(ListNode head) {
            
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        return false;
}

    public static void main(String[] args) {
        LinkedListBasics l1 = new LinkedListBasics();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        l1.printLL();


        System.out.println("\ Linked list has cycle  : "+ l1.hasCycle(head));
        
    }
}
