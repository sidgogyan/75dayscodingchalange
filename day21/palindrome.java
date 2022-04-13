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
    public boolean isPalindrome(ListNode head) {
       ListNode midnode=mid(head);
        System.out.println(midnode.val);
       ListNode node=reverse(midnode);
        ListNode one=head;
        ListNode two=node;
        
        while(two!=null){
            System.out.println(one.val);
            System.out.println(two.val);
            if(one.val!=two.val){
                return false;
            }
            one=one.next;
            two=two.next;
        }
        return true;
    }
    
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
            
        }
        return pre;
        
    }
}