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
 class Pair
 {
    int row;
    int col;
    TreeNode node;
    Pair(TreeNode node,int row,int col)
    {
        this.node=node;
        this.row=row;
        this.col=col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<Pair>> map=new TreeMap<>();

        Queue<Pair> q=new LinkedList<>();

        q.offer(new Pair(root,0,0));
        
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            TreeNode node=p.node;
            int row=p.row;
            int col=p.col;


            if(node.left!=null)
            {
                q.add(new Pair(node.left,row+1,col-1));
            }
            if(node.right!=null)
            {
                q.add(new Pair(node.right,row+1,col+1));
            }

            if(!map.containsKey(col))
            {
                map.put(col,new ArrayList<>());
            }
            map.get(col).add(new Pair(node,row,col));

        }

        List<List<Integer>> res=new ArrayList<>();

        for(List<Pair> nodes:map.values())
        {
            Collections.sort(nodes,(a,b)->
            {
                if(a.row==b.row)
                {
                    return a.node.val-b.node.val;
                }
                return a.row-b.row;
            });

            List<Integer> list_1=new ArrayList<>();
            for(Pair p:nodes)
            {
                list_1.add(p.node.val);
            }
            res.add(new ArrayList<>(list_1));
        }


        return res;
    }
}


