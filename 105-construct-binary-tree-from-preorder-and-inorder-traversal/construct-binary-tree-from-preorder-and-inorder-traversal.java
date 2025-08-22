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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map_1=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map_1.put(inorder[i],i);
        }

        TreeNode result=construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map_1);
        return result;
        
    }

    public TreeNode construct(int[] preorder,int preSt,int preEnd,int[] inorder,
    int inSt,int inEnd,Map<Integer,Integer> map_1)
    {
        if(preSt>preEnd || inSt>inEnd)
        {
            return null;
        }

        TreeNode root=new TreeNode(preorder[preSt]);
        int inroot=map_1.get(root.val);
        int numsLeft=inroot-inSt;
        root.left=construct(preorder,preSt+1,preSt+numsLeft,inorder,inSt,inroot-1,map_1);
        root.right=construct(preorder,preSt+numsLeft+1,preEnd,inorder,inroot+1,inEnd,map_1);

        return root;
    }
}