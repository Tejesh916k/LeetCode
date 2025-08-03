class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> curr=new ArrayList<>();
        find_combinations(c,0,target,curr,res);
        return res;
        
    }
    public void find_combinations(int [] c,int ind,int target,
    List<Integer> curr,List<List<Integer>> res)
    {
        if(ind==c.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        if(c[ind]<=target)
        {
            curr.add(c[ind]);
            find_combinations(c,ind,target-c[ind],curr,res);
            curr.remove(curr.size()-1);
        }
        find_combinations(c,ind+1,target,curr,res);
    }
}