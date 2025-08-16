class Solution {
    public int maximum69Number (int n) { 
        String str=Integer.toString(n);
        char[] chr=str.toCharArray();
        for(int i=0;i<chr.length;i++)
        {
            if(chr[i]=='6')
            {
                chr[i]='9';
                break;
            }
        }
        String str_2=new String(chr);
        int res=Integer.parseInt(str_2);
        return res;
    }
}