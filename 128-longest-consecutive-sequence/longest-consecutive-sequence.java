class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set_1=new HashSet<>();
        int maxi=0;
        if(nums.length==0 || nums==null)
        {
            return 0;
        }
        for(int num:nums)
        {
            set_1.add(num);
        }
        for(int num:set_1)
        {
            if(!set_1.contains(num-1))
            {
                int seq=1;
                int curr_num=num;
                while(set_1.contains(curr_num+1))
            {
                seq++;
                curr_num++;
            }
            maxi=Math.max(maxi,seq);

            }

        }
        return maxi;
    }
}