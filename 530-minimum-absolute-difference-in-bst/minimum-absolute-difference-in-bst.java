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
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> set_1=new ArrayList<>();
        dfs(root,set_1);
        Collections.sort(set_1);
        int max_diff=Integer.MAX_VALUE;
        for(int i=1;i<set_1.size();i++)
        {
            if((set_1.get(i)-set_1.get(i-1))<max_diff)
            {
                max_diff=set_1.get(i)-set_1.get(i-1);
            }
        }
        return max_diff;
    }
    public void dfs(TreeNode root,List<Integer> set_1)
    {
        if(root==null)
        {
            return; 
        }
        set_1.add(root.val);
        dfs(root.left,set_1);
        dfs(root.right,set_1);
    }
}