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
    public ListNode swapPairs(ListNode head) {
        ListNode dup=new ListNode(0);
        dup.next=head;
        ListNode prev=dup;
        while(head!=null && head.next!=null)
        {
            ListNode x=head;
            ListNode y=head.next;

            prev.next=y;
            x.next=y.next;
            y.next=x;
            
            prev=x;
            head=x.next;
        }

        return dup.next;
    }
}