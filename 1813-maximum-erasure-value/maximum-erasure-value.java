class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int curr_sum=0;
        int max_sum=0;
        int j=0;
        Set<Integer> set_1=new HashSet<>();
        for(int i=0;i<nums.length;i++)
         {       
            while(set_1.contains(nums[i]))
                {
                    set_1.remove(nums[j]);
                    curr_sum-=nums[j];
                    j++;                    
                }
        
            set_1.add(nums[i]);
            curr_sum+=nums[i];
            max_sum=Math.max(max_sum,curr_sum);
            
        }
        return max_sum;
    }
}