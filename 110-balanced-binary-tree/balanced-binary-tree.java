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
    public boolean isBalanced(TreeNode root) {

        int h=height_balanced(root);
        System.out.print(h);
        if(h==-1)
        {
            return false;
        }
        return true;
    }
        int height_balanced(TreeNode root)
        {
            if(root==null)
            {
                return 0;
            }
            int lh=height_balanced(root.left);
            if(lh==-1) return -1;
            int rh=height_balanced(root.right);
            if(rh==-1) return -1;

            if(Math.abs(lh-rh)>1)
            {
                return -1;
            }


            return 1+Math.max(lh,rh);
        }
        
    
}