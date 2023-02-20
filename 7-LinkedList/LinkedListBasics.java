public class LinkedListBasics{
  public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

  // Insert node at front end
    public static void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

   // Insert node at rear end
    public static void insertAtTail(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

  // Insert node at middle position
    public static void insertAtMiddle(int data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;
        int index = 0;
        if (pos == 0) {
            newNode.next = temp;
            head = newNode;
            return;
        }

        while (temp.next != null && index < pos - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

  // Remove node at front end
    public static void removeFirst() {
        if (head == null && head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

  // Remove node at rear end
    public static void removeLast() {
        if (head == null && head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

  // Remove node at middle position
    public static void removeMiddleNode(int pos) {
        Node temp = head;
        if (temp == null || temp.next == null) {
            head = null;
            return;
        } else if (pos == 0) {
            head = head.next;
            return;
        }
        int index = 0;
        while (temp.next != null && index < pos - 1) {
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
    }

  // Function to traverse a LinkedList
    public static void traverseLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        insertAtHead(4);
        insertAtHead(3);
        insertAtHead(2);
        insertAtHead(1);
        
        insertAtTail(5);
        
        insertAtMiddle(5, 0);
        
        removeFirst();
        removeLast();
        removeMiddleNode(3);
       
        traverseLL();
      
    }

}
