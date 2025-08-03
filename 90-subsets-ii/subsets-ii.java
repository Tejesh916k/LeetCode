class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list_1=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,nums.length,new ArrayList<>(),list_1);
        return list_1;
    }
    public void subset(int[] nums,int ind,int n,List<Integer> curr,List<List<Integer>> res)
    {
        res.add(new ArrayList<>(curr));
        for(int i=ind;i<n;i++)
        {
            if(i>ind && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            subset(nums,i+1,n,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}