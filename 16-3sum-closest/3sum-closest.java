class Solution {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> list_1=new ArrayList<>();
        int close=nums[0]+nums[1]+nums[2];
        int maxi=Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if (Math.abs(sum-target)<Math.abs(close-target))
                {
                    close=sum;                               
                }
                if(sum<target)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }  
        }
        System.out.println(close);
        return close;
    }
}