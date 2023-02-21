class CheckPalindrome{
    
    public static Node findMid() {
        Node slow = head, fast = head;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid();

        Node prev = null, next = null, curr = mid;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    
   
}
