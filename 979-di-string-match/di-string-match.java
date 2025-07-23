class Solution {
    public int[] diStringMatch(String s) {
        int[] nums=new int[s.length()+1];
        int i_s=0;
        int d_s=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                nums[i]=i_s;
                i_s++;
            }
            else
            {
                nums[i]=d_s;
                d_s--;
            }
          
        }
          nums[s.length()]=i_s;
          return nums;
    }
}