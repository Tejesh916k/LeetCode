class Solution {
    public int maxScore(int[] arr, int k) {
        
        int l_sum=0;
        int r_sum=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            l_sum+=arr[i];
        }
        int maxi=l_sum;
        int j=arr.length-1;
        for(int i=k-1;i>=0;i--)
        {
            l_sum-=arr[i];
            r_sum+=arr[j];
            j--;
            maxi=Math.max(maxi,l_sum+r_sum);
        }
        return maxi;
        

    }
}