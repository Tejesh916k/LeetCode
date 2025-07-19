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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l_1=new ArrayList<>();
        if(root==null)
        {
            return l_1;
        }
        int curr_sum=0;
        List<Integer> list_1=new ArrayList<>();
        return find_path(root,curr_sum,targetSum,l_1,list_1);
        
    }
    public  List<List<Integer>> find_path(TreeNode node,int curr_sum,int targetSum,List<List<Integer>> l_1,List<Integer> list_1)
    {        
        curr_sum+=node.val;
        list_1.add(node.val);
        if(node.left==null && node.right==null)
        {
            if(curr_sum==targetSum)
            {
                l_1.add(new ArrayList<>(list_1));
            }
        }
        if(node.left!=null)
        {
            find_path(node.left,curr_sum,targetSum,l_1,list_1);
        }
        if(node.right!=null)
        {
            find_path(node.right,curr_sum,targetSum,l_1,list_1);
        }
        list_1.remove(list_1.size()-1);
        return l_1;
    }
}