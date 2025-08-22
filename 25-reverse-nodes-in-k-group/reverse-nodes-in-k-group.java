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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp=head;
        ListNode previous=null;
        while(temp!=null)
        {
            ListNode n_node=getNode(temp,k);
            if(n_node==null)
            {
                if(previous!=null) previous.next=temp;
                break;
            }


        ListNode next=n_node.next;
        n_node.next=null;
        reverse(temp);
        if(temp==head)
        {
            head=n_node;
        }
        else
        {
            previous.next=n_node;
        }
        previous=temp;
        temp=next;
        }
        return head;
    }

    public ListNode getNode(ListNode temp,int k)
    {
        k--;
        while(temp!=null && k>0)
        {
            temp=temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverse(ListNode h)
    {
        ListNode curr=h;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}