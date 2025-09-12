class Solution {
    String res="";
    int count=0;
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        boolean[] visited=new boolean[n+1];
        backtrack(k,n,sb,visited);
        return res;

    }
      public void backtrack(int k,int n,StringBuilder sb,boolean[] visited)
      {
        if(sb.length()==n)
        {
            count++;
            if(count==k)
            {
                res=sb.toString();
            }
            return;
        }

         for(int i=1;i<=n;i++)
         {
            if(visited[i]==true) continue;
            visited[i]=true;
            sb.append(i);
            backtrack(k,n,sb,visited);
            sb.deleteCharAt(sb.length()-1);
            visited[i]=false;

         }
      }
}