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
    public ListNode removeZeroSumSublists(ListNode head) {
        
        HashMap<Integer,ListNode> map_1=new HashMap<>();
        ListNode dummy =new ListNode(0);

        dummy.next=head;
        int pre_sum=0;

        ListNode dup=dummy;

        while(dup!=null)
        {
            pre_sum+=dup.val;
            map_1.put(pre_sum,dup);
            dup=dup.next;
        }

        pre_sum=0;
        dup=dummy;

        while(dup!=null)
        {
            pre_sum+=dup.val;
            dup.next=map_1.get(pre_sum).next;
            dup=dup.next;
        }
        return dummy.next;



    }
}