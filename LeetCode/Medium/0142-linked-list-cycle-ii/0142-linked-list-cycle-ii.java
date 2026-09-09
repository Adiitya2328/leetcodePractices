/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //first of all we need to check that there is a loop or not 
        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){//if there is a loop then we have to find the starting
                slow=head;//initialize the slow to head 
                while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
                }return slow;//this will return the starting point of cycle
                
            }
        }
        return null;
    }
}