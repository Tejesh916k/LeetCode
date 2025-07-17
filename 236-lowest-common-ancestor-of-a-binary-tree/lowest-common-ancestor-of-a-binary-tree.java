/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> l_1=new ArrayList<TreeNode>();
        List<TreeNode> l_2=new ArrayList<TreeNode>();

        
        common(root,l_1,p);
        common(root,l_2,q);
        TreeNode res=null;
        for(int i=0;i<Math.min(l_1.size(),l_2.size());i++)
        {
            if(l_1.get(i).val==l_2.get(i).val)
            {
                res=l_1.get(i);
            }
        }
       
        
        return res;

    }
    public boolean common(TreeNode root,List<TreeNode> list,TreeNode x)
    {
        if(root==null)
        {
            return false;
        }
        list.add(root);
        if(root.val==x.val)
        {
            return true;
        }
        boolean lh=common(root.left,list,x);
        boolean rh=common(root.right,list,x);

        if(lh||rh)
        {
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    
}