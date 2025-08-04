class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  res=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        permutations(nums,new ArrayList<>(),res,freq);
        return res;
    }
    public void permutations(int[] nums,List<Integer> list_1,
    List<List<Integer>> res,boolean[] freq)
    {
        if(list_1.size()==nums.length)
        {
            res.add(new ArrayList<>(list_1));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                list_1.add(nums[i]);
                permutations(nums,list_1,res,freq);
                list_1.remove(list_1.size()-1);
                freq[i]=false;

            }
        }
    }
}