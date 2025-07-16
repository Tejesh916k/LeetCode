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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l_1=new ArrayList<>();
        if(root==null)
        {
            return l_1;

        }
        if(root.left==null && root.right==null)
        {
            String s=Integer.toString(root.val);
            l_1.add(s);
            return l_1;
        }
        paths(root,"",l_1);
        return l_1;
    }
    public void paths(TreeNode root,String path,List<String> l_1)
    {
        if(root==null)
        {
            return;
        }
        path+=Integer.toString(root.val);
        if(root.left==null && root.right==null)
        {
            l_1.add(path);
            return;
        }
        path+="->";
        paths(root.left,path,l_1);
        paths(root.right,path,l_1);
    }
}