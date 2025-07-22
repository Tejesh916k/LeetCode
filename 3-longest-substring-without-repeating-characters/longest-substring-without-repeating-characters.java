class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=0;
        Set<Character> set_1=new HashSet<>();
        int l=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            while(set_1.contains(s.charAt(i)))
            {
                set_1.remove(s.charAt(l));
                l++;
            }
            set_1.add(s.charAt(i));
            maxi=Math.max(maxi,i-l+1);
        }
        return maxi;
    }
}