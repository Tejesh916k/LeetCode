class Solution {
    public int merge(int[]nums,int low,int mid,int high)
    {
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(j<=high && nums[i]>( 2L *nums[j]))
            {
                j++;
            }
            count+=j-(mid+1);
        }

        int[] res=new int[high-low+ 1];
        int l=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                res[l++]=nums[left++];
            }
            else res[l++]=nums[right++];
        }
        while(left<=mid)
        {
            res[l++]=nums[left++];
        }
        while(right<=high)
        {
            res[l++]=nums[right++];
        }
        l=low;
        for(int i=0;i<res.length;i++)
        {
            nums[l+i]=res[i];
        }
        return count;
    }
    public int reversePairs(int[] nums) {
     int low=0;
     int high=nums.length-1;
     int res=mergesort(nums,low,high);
      return res; 
    }
    public int mergesort(int[]nums,int low,int high)
    {
        if(low>=high) return 0;
        int mid=low+(high-low)/2;
        int res=mergesort(nums,low,mid);
        res+=mergesort(nums,mid+1,high);
        res+=merge(nums,low,mid,high);

        return res;
    }
}