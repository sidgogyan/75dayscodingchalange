/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=headA;
        
        ListNode slow=headB;
        ListNode fast=headB;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=headB;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                
                temp1.next=null;
                return slow;
               
                
            }
        }
        
        temp1.next=null;
        return null;
       
        
        
    }
}