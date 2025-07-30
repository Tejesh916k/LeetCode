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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map_1 = new HashMap<>();
        dfs(root,map_1);
        int count=0;
        for(int i:map_1.values())
        {
            if(i>count)
            {
                count=i;
            }
        }
        List<Integer> l_1=new ArrayList<>();
        int val=0;
        for(Map.Entry<Integer,Integer> e:map_1.entrySet())
        {
            if(e.getValue()==count)
            {
                l_1.add(e.getKey());
            }
        }
        int [] res=new int[l_1.size()];
        for(int i=0;i<l_1.size();i++)
        {
            res[i]=l_1.get(i);
        }
        return res;
       
    }
    public void dfs(TreeNode root,Map<Integer,Integer> map_1)
    {
        if(root==null)
        {
            return;
        }
        map_1.put(root.val,map_1.getOrDefault(root.val,0)+1);
        dfs(root.left,map_1);
        dfs(root.right,map_1);
    }
        
}