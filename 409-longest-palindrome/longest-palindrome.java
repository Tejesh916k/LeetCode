class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map_1=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map_1.put(c,map_1.getOrDefault(c,0)+1);
        }
        int len=0;
        for(Map.Entry<Character,Integer> e:map_1.entrySet())
        {
            if(e.getValue()%2==0)
            {
                len+=e.getValue();
            }
            else
            {
                len+=e.getValue()-1;
            }
        }
        if(len<s.length())
        {
            return len+1;
        }
        return len;
    }
}