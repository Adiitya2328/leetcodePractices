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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length =0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        k=k%length;
        for(int i=0;i<k;i++){
            curr=head;
            prev=null;
            while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        curr.next=head;
        head=curr;
        }
        return head;
        
    }
}