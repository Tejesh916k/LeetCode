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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode curr=head;
        ListNode fast=head.next;
        ListNode another=head;
        while(fast!=null && fast.next!=null)
        {
           slow=slow.next;
           fast=fast.next.next;
        }
        ListNode middle=slow.next;
        slow.next=null;
        curr=middle;
        ListNode next=null;
        ListNode midAns=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=midAns;
            midAns=curr;
            curr=next;
        }
        curr=head;
        while(midAns!=null)
        {
            ListNode x=curr.next;
            ListNode y=midAns.next;
            curr.next=midAns;
            midAns.next=x;
            curr=x;
            midAns=y;

        }



    }
}