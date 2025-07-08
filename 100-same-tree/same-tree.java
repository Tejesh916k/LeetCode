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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        q1.add(p);
        q1.add(q);
        while(!q1.isEmpty())
        {
            TreeNode x=q1.poll();
            TreeNode y=q1.poll();

            if(x==null && y==null)
            {
                continue;
            }

            else if(x==null || y==null || x.val!=y.val)
            {
                return false;
            }
            
            q1.add(x.left);
            q1.add(y.left);
            q1.add(x.right);
            q1.add(y.right);

        }
        return true;
    }
}