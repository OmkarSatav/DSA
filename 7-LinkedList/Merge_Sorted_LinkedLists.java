public class Merge_Sorted_LinkedLists {
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

  
  // Merge sorted Linked Lists
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode LL = new ListNode(0);
        ListNode temp = LL;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        
        if(list1 != null){
            temp.next = list1;
        }else if(list2 != null){
            temp.next = list2;
        }
        
        return LL.next;
        
    }
  
    public static void main(String[] args) {
        Merge_Sorted_LinkedList l1 = new Merge_Sorted_LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);

        l1.printLL();


       Merge_Sorted_LinkedList l2 = new Merge_Sorted_LinkedList();
        l2.addFirst(1);
        l2.addFirst(2);
        l2.addFirst(3);
        l2.addFirst(4);
        l2.addFirst(5);
      
      // 1->2->3->4->5->
      // 1->2->3->4->5->
      //1->1->2->2->3->3->4->4->5->5->
        Merge_Sorted_LinkedList l3 = mergeTwoList(l1,l2);
        l3.printLL();
    }
}
