class ZigZag{

  
	public static Node zigZag(Node head){
        //add code here.
        
         if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        boolean flag = true;
        
        while (temp.next != null) {
           if(flag){
               if(temp.data > temp.next.data){
                   int t = temp.data;
                   temp.data = temp.next.data;
                   temp.next.data = t;
               }
               flag = !flag;
           }
           else{
               if(temp.data < temp.next.data){
                   int t = temp.data;
                   temp.data = temp.next.data;
                   temp.next.data = t;
               }
               flag = !flag;
           }
           
           temp = temp.next;
        }
        return head;
    }

}
