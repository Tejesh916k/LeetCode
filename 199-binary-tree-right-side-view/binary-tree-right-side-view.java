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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> l_1=new ArrayList<>();
        Queue<TreeNode> q_1=new LinkedList<TreeNode>();
        if(root==null)
        {
            return l_1;
        }
         q_1.offer(root);
         
         while(!q_1.isEmpty())
         {
            int size=q_1.size();
            while(size!=0)
            {
                TreeNode some=q_1.poll();
                if(size==1)
                {
                    l_1.add(some.val);
                }
                if(some.left!=null)
                {
                    q_1.offer(some.left);
                }
                if(some.right!=null)
                {
                    q_1.offer(some.right);
                }
                size--;
            }
         }

        return l_1;
    }
}