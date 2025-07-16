class Solution {
    public int maximumLength(int[] nums) {

        int odd=0,even=0,alt=1;
        int prev=nums[0];

        if(nums[0]%2 != 0)
        {
            odd++;
        }
        else even++;

        for(int i=1;i<nums.length;i++)
        {
            if(prev%2!=nums[i]%2)
            {
                alt++;
            }
            if(nums[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            prev=nums[i];
        }
        System.out.println(alt);
        System.out.println(odd);
        System.out.println(even);
       

       return Math.max(alt,Math.max(even,odd));
    }
}