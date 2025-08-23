class Solution {
    public List<String> generateParenthesis(int n) {        
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generate(n,0,0,sb,res);
        return res;
    }
    public void generate(int n,int l,int r,StringBuilder sb,List<String> res)
    {
        if(n==l && n==r)
        {
            String str=sb.toString();
            res.add(str);
            return;
        }
        if(l<n)
        {
            sb.append('(');
            generate(n,l+1,r,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        if(r<l)
        {
            sb.append(')');
            generate(n,l,r+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}