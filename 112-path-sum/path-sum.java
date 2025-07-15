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
    public boolean hasPathSum(TreeNode root, int targetSum) {
           return path_sum(root,0,targetSum);
    }
    public boolean path_sum(TreeNode root,int curr_sum,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        curr_sum+=root.val;

        if(root.left==null && root.right==null)
        {
            if(curr_sum==targetSum)
            {
                return true;
            }
        }

        return path_sum(root.left,curr_sum,targetSum) || path_sum(root.right,curr_sum,targetSum);
    }
}
