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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast =head;
        fast=head.next.next;
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
        // ListNode temp=head;
        // int count =0;
        // int mid;
        // if(head==null){//if there is no element return head or null
        //     return head;
        // }
        // if(head.next ==null){//if there is one element then it will be the middle one
        //     return null;
        // }
        // while(temp!=null){
        //     count++;//count the numbers of nodes in the list 
        //     temp =temp.next;
        // }
        
        //     mid = (count/2)-1;//store the position just before the mid
        
        // temp = head;
        // while(mid!=0){
        //     temp=temp.next;//reach to that position and delete the connection
        //     mid--;
        // }temp.next = temp.next.next;
        // return head; //brute force
    }
}