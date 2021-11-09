public ListNode sortList(ListNode head) {
        
        if(head==null)
            return head;
        
        //extra space O(n), n= number of nodes
        PriorityQueue<ListNode>pq=new PriorityQueue<ListNode>((n1,n2)->{
                                return n1.val- n2.val;
                                });
        while(head!=null){
            pq.add(head);
            head=head.next;
        }
        
        ListNode node = new ListNode(0);
        ListNode newHead = node;
        node.next = pq.poll();
        node=node.next;
        while(!pq.isEmpty()){
            node.next = pq.poll();
            node = node.next;
        }
        node.next = null; //terminate linkedlist
        
        return newHead.next;
    }
    //TC :O(n)
}