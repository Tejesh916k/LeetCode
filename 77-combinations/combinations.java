class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();

        combo(1,n,k,new ArrayList<>(),res);
        return res;
    }
    public void combo(int ind,int n,int k,List<Integer> curr,List<List<Integer>> res)
    {
        if(curr.size()==k)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<=n;i++)
        {
            curr.add(i);
            combo(i+1,n,k,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}