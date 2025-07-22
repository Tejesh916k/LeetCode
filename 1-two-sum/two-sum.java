class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map_1=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int sub=target-nums[i];
            if(map_1.containsKey(sub))
            {
                return new int[]{map_1.get(sub),i};
            }

            map_1.put(nums[i],i);
        }
        return new int[]{};
    }
}