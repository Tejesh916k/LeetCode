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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=new ListNode(0);
        ListNode result=res;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode n:lists)
        {
            if(n!=null)
            {
                pq.offer(n);
            }
        }
        while(!pq.isEmpty())
        {
            ListNode curr=pq.poll();
            result.next=curr;
            result=result.next;
            if(curr.next!=null) pq.offer(curr.next);
        }
        return res.next;
    }
}