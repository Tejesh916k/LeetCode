class Solution {
    public long subArrayRanges(int[] nums) {
        return maximum(nums)-minimum(nums);
    }
    public long minimum(int[] nums)
    {
        int[] pse=new int[nums.length];
        int[] nle=new int[nums.length];

        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!stk.isEmpty() && nums[stk.peek()]>nums[i]){
                stk.pop();
            }
            pse[i]=stk.isEmpty()? -1:stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && nums[stk.peek()]>=nums[i])
            {
                stk.pop();
            }
            nle[i]=stk.isEmpty() ? nums.length:stk.peek();
            stk.push(i);
        }
        long res=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            long count=(long) ((i-pse[i]) * (nle[i]-i));
            res=res+(long)nums[i]*count;
        }
        return res;
    }
    public long maximum(int[] nums)
    {
        int[] pse=new int[nums.length];
        int[] nle=new int[nums.length];

        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!stk.isEmpty() && nums[stk.peek()]<=nums[i]){
                stk.pop();
            }
            pse[i]=stk.isEmpty()? -1:stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && nums[stk.peek()]<nums[i])
            {
                stk.pop();
            }
            nle[i]=stk.isEmpty() ? nums.length:stk.peek();
            stk.push(i);
        }
        long res=0;
        for(int i=0;i<nums.length;i++)
        {
            long count=(long) ((i-pse[i]) * (nle[i]-i));
            res=res+(long)nums[i]*count;
        }
        return res;
    }
}