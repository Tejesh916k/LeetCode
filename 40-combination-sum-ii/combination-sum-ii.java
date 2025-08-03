class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(c);
        combo(c,0,t,new ArrayList<>(),res);
        return res;
    }
    private void combo(int[] c,int ind,int t,List<Integer> curr,
    List<List<Integer>> res)
    {
        if(t==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<c.length;i++)
        {
            if(i>ind && c[i]==c[i-1])
            {
                continue;
            }
            if(c[i]>t) break;
            curr.add(c[i]);
            combo(c,i+1,t-c[i],curr,res);
            curr.remove(curr.size()-1);
        }
    }
}