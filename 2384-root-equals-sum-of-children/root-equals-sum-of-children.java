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
    public boolean checkTree(TreeNode root) {
         int child_sum=0;
         if(root.left!=null)
         {
            child_sum+=root.left.val;
         }
         if(root.right!=null)
         {
            child_sum+=root.right.val;
         }
        if(child_sum!=root.val)
        {
            return false;
        }
        if(root.left!=null)checkTree(root.left);
        if(root.right!=null)checkTree(root.right);
        return true;
    }
}