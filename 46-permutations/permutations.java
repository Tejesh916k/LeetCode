class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  res=new ArrayList<>();        
        permutations(nums,0,res);
        return res;
    }
    public void permutations(int[] nums,int ind,List<List<Integer>> res)
    {
        if(ind==nums.length)
        {
            List<Integer> list_1=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                list_1.add(nums[i]);
            }
            res.add(new ArrayList<>(list_1));
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
            swap(i,ind,nums);
            permutations(nums,ind+1,res);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}