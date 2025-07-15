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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l_1=new ArrayList<>();
        Stack<TreeNode> stk=new Stack<TreeNode>();
        if(root==null)
        {
            return l_1;
        }
        stk.push(root);
        while(!stk.isEmpty())
        {
            root=stk.pop();
            l_1.add(root.val);
            if(root.left!=null)
            {
                stk.push(root.left);
            }
            if(root.right!=null)
            {
                stk.push(root.right);
            }
        }
        List<Integer> org=new ArrayList<>();
        for(int i=l_1.size()-1;i>=0;i--)

        {
            org.add(l_1.get(i));
            
        }
        return org;
    }
}