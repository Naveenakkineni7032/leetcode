class Solution {
    public ListNode removeNodes(ListNode head) {
       ListNode max = head;
       Stack<ListNode> stack = new Stack<>();

       while (max != null){
        stack.push(max);
        max = max.next;
       }
       max = stack.pop();
       int value = max.val;
       ListNode dummy = new ListNode(value);
       while(!stack.isEmpty()){
        max = stack.pop();
        if(max.val < value)
            continue;
        else{
            ListNode node = new ListNode(max.val);
             node.next = dummy;
             dummy = node;
             value = max.val;
        }
       }
       return dummy;
    }
}