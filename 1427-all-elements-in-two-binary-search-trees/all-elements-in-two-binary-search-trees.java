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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list_1=new ArrayList<>();
        List<Integer> list_2=new ArrayList<>();

        inOrder(root1,list_1);
        inOrder(root2,list_2);

        List<Integer> result=merge(list_1,list_2);
        
        return result;
    }
    public void inOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
    }
    public List<Integer> merge(List<Integer> list_1,List<Integer> list_2)
    {
        int n=list_1.size()+list_2.size();
        int i=0;
        int j=0;
        List<Integer> res=new ArrayList<>();
        while(i<list_1.size() && j<list_2.size())
        {
            if(list_1.get(i)<list_2.get(j))
            {
                res.add(list_1.get(i));
                i++;
            }
            else
            {
                res.add(list_2.get(j));
                j++;
            }

        }
       
        while(i<list_1.size()) res.add(list_1.get(i++));           
        while(j<list_2.size()) res.add(list_2.get(j++));
    
        return res;
    }
}