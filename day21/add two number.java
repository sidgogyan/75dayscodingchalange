/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {
    ListNode dummy=null;
    ListNode pre=dummy;
    ListNode curr=head;
    
    while(curr!=null){
       ListNode temp=curr.next;
        curr.next=pre;
        pre=curr;
        curr=temp;
    }
    
    return pre;
}
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
l1=reverse(l1);
l2=reverse(l2);
    
    
     ListNode dummy=new ListNode(-1);
    ListNode temp1=dummy;
   int carry=0;
    
   while(l1!=null && l2!=null){
       int val1=(l1.val+l2.val+carry);
       int val=val1%10;
       carry=val1/10;
     
       ListNode temp=new ListNode(val);
       temp1.next=temp;
       temp1=temp;
       l1=l1.next;
       l2=l2.next;
      
   }
    while(l1!=null){
        int val1=(l1.val+carry);
       int val=val1%10;
       carry=val1/10;

       ListNode temp=new ListNode(val);
       temp1.next=temp;
       temp1=temp;
       l1=l1.next;
      
    }
    while(l2!=null){
      int val1=(l2.val+carry);
       int val=val1%10;
       carry=val1/10;
       ListNode temp=new ListNode(val);
       temp1.next=temp;
       temp1=temp;
       l2=l2.next;
      
    }
    if(carry!=0){
            int val=carry;
        carry=0;
       ListNode temp=new ListNode(val);
       temp1.next=temp;
       temp1=temp;
     
    }
    ListNode ans=reverse(dummy.next);
    return ans;
    
    
    
    
    
    
}
}