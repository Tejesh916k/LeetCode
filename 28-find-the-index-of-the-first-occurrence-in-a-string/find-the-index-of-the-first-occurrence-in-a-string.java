class Solution {
    public int strStr(String haystack, String needle) {
      int len=needle.length();
      int len1=haystack.length();
 
      for(int i=0;i<=len1-len;i++)
      {
        
        String s=haystack.substring(i,i+len);
        if(s.equals( needle))
        {
          return i;
        
      }
      }
      
      
        return -1;
      
        
    }
}