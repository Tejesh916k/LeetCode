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
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
         if(head==null||head.next==null)
        {
            return head;
        }
        
        k=k%count;
        if(k==0)
        {
            return head;
        }
        int i=count-k;
        ListNode now=head;
        ListNode duplicate=head;
        
        while(i>1)
        {
            duplicate=duplicate.next;
            i--;
        }
        head=duplicate.next;
        duplicate.next=null;
        
        ListNode y=head;
        while(y.next!=null)
        {
            y=y.next;
        }
        y.next=now;
        
        return head;
        
    }
}