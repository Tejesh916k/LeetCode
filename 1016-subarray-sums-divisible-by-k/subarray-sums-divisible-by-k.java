class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int pre_sum=0;
        Map<Integer,Integer> set_1=new HashMap<>();
        set_1.put(0,1);
        int res=0;    

        for(int i:nums)
        {
            pre_sum+=i;
            int rem=pre_sum%k;
            if(rem<0) rem+=k;
            if(set_1.containsKey(rem))
            {
                res+=set_1.get(rem);
            }
            set_1.put(rem,set_1.getOrDefault(rem,0)+1);
        }
        return res;   


    }
}