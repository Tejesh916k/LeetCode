/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair
    {
        int num;
        TreeNode node;
        Pair(TreeNode node,int num)
        {
            this.num=num;
            this.node=node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
        int ans=0;
        if(root==null)
        {
            return ans;
        }
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));

        while(!q.isEmpty())
        {
            int first=0,last=0;
            int size=q.size();
            int mmin=q.peek().num;
            for(int i=0;i<size;i++)
            {
                int curr_num=q.peek().num-mmin;
                TreeNode node=q.peek().node;

                q.poll();

                if(i==0) first=curr_num;
                if(i==size-1) last=curr_num;

                if(node.left != null) {
                    q.offer(new Pair(node.left,(curr_num*2)+1));
                    }
                if(node.right != null) {
                    q.offer(new Pair(node.right,(curr_num*2)+2));
                }
                
            }
            ans=Math.max(ans, last-first+1);
        }

            return ans;
    }
}