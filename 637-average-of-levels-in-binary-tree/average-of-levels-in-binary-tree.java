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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null) return null;
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
               if(node.left!=null) q.offer(node.left);
               if(node.right!=null) q.offer(node.right);
               sum+=node.val;

            }
            Double value=Math.round(sum*1.0*100000)/(size*100000.0);
            res.add(value);
        }
        return res;
    }
}