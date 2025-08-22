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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        Map<Integer,Integer> map_1=new HashMap<>();

        for(int i=0;i<inorder.length;i++)
        {
            map_1.put(inorder[i],i);
        }
        TreeNode result=build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map_1);
        return result;
    }
    public TreeNode build(int[] postorder,int postSt,int postEnd,int[] inorder,int inSt,int inEnd,Map<Integer,Integer> map_1)
    {
        if(postEnd<postSt || inSt>inEnd) return null;

        TreeNode root=new TreeNode(postorder[postEnd]);
        int inroot=map_1.get(postorder[postEnd]);

        int numsLeft=inroot-inSt;
        root.left=build(postorder,postSt,postSt+numsLeft-1,inorder,inSt,inroot-1,map_1);
        root.right=build(postorder,postSt+numsLeft,postEnd-1,inorder,inroot+1,inEnd,map_1);
        return root;
    }
}