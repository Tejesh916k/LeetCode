class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(String s,int ind,List<String> curr,List<List<String>> res)
    {
        if(ind==s.length())
        {
            res.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=ind;i<s.length();i++)
        {
            boolean isPalindrome=check(s.substring(ind,i+1));
            if(isPalindrome)
            {
                curr.add(s.substring(ind,i+1));
                backtrack(s,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean check(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}