class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
           ListNode rn=curr.next;
           curr.next=pre;
           pre=curr;
            curr=rn;
            
        }
        head=pre;
        return head;
        
    }
}