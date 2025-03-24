class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      Set<String>  set_1=new HashSet<>(wordDict);
      int max_count=0;
      for(String word:wordDict){
        max_count=Math.max(max_count,word.length());
      }
      
      int n=s.length();
      boolean[] arr=new boolean[n+1];
      arr[0]=true;
      for(int i=1;i<=n;i++)
      {
        for (int j=i-1;j>=Math.max(0,i-max_count);j--)
        {
            if(set_1.contains(s.substring(j,i)) && arr[j])
            {
                arr[i]=true;
                break;
            }
        }
      }

      return arr[n];
    }
}