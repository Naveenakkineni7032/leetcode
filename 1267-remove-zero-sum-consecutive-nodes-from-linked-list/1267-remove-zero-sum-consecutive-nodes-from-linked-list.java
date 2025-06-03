class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode temp = h;
        while(temp != null)
        {
            ListNode t1 = temp.next;
            int sum =0;
            while(t1 != null)
            {
                sum += t1.val;
                if(sum == 0 )
                {
                    temp.next = t1.next;
                }
                t1 = t1.next;
            }
            if(temp != null)
                temp = temp.next;
        }
        
        return h.next;
    }
}