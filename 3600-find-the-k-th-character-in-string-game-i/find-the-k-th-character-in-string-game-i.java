class Solution {
    public char kthCharacter(int k) {
        StringBuilder str=new StringBuilder("a");
       str_manu(k,str);
       return str.charAt(k-1);
    }
    public void str_manu(int k,StringBuilder str)
    {
        if(str.length()>=k)
        {
            return;
        }
        int n=str.length();
        for(int i=0;i<n;i++)
        {
           char c=str.charAt(i);
           str.append((char)('a'+ ((c-'a'+1)%26)));
        }
        str_manu(k,str);
    }
}