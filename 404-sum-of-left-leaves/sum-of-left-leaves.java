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
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root==null || (root.left==null && root.right==null))
        {
            return 0;
        }
        int sum=0;
       return check(root);
        
    }
    public int check(TreeNode root)
    {
       
        if(root==null)
        {
            return 0;
        }
         int sum=0;
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            sum+=root.left.val;
        }
        sum+=check(root.left);
        sum+=check(root.right);

        return sum;
    }
    
}