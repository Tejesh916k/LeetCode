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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> l_1=new LinkedList<List<Integer>>();
        Queue<TreeNode> q_1=new LinkedList<TreeNode>();

        if(root==null)
        {
            return l_1;

        }
        int j=0;
        q_1.offer(root);
        boolean is_true=true;
        while(!q_1.isEmpty())
        {
            List<Integer> l_2=new LinkedList<Integer>();
            int size=q_1.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q_1.poll();

                if(is_true)
                {
                    l_2.addLast(node.val);
                }
                else
                {
                    l_2.addFirst(node.val);
                }

                if(node.left!=null) q_1.offer(node.left);
                if(node.right!=null) q_1.offer(node.right);

                

            }
            l_1.add(l_2);
            is_true=!is_true;
        
        }
        return l_1;
        
    }
}