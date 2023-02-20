class RemoveNthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }

        
        temp = head;
        if (n == count) {
            head = head.next;
            return head;
        }

        int index = 1;
        int find = count - n; // 5 - 1 == 4 

        while (temp.next != null && index < find) {
            temp = temp.next;
            index++;
        }

        temp.next = temp.next.next;
        count--;
        return head;
    }
}
