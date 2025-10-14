
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        int count=1;
        if(k==1) return true;
        for(int i=1;i<n-k;i++)
        {
            int l=i;
            int r=i+k;
            count=1;
            while(r<n && nums.get(l-1)<nums.get(l) && nums.get(r-1)<nums.get(r))
            {
                count++;
                l++;
                r++;
                if(count==k) return true;                
            }
            
            System.out.println(i);

        }
        return false;

    }
}