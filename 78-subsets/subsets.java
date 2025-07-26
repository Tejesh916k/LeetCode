class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        return backtrack(nums,0,new ArrayList<>(),res);
        
    }
    public static List<List<Integer>> backtrack(int[] nums,int start,List<Integer> curr,List<List<Integer>> res) 
    {    
        res.add(new ArrayList<> (curr));
        for(int i=start;i<nums.length;i++)
        {
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
        return res;
    
    }

}