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
        ListNode temp=head;
        int count =0;
        int mid;
        if(head==null){
            return head;
        }
        if(head.next ==null){
            return null;
        }
        while(temp!=null){
            count++;
            temp =temp.next;
        }
        
            mid = (count/2)-1;
        
        temp = head;
        while(mid!=0){
            temp=temp.next;
            mid--;
        }temp.next = temp.next.next;
        return head;
    }
}