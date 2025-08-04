class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        sb.append(chars[0]);
        int l=0;
        int sum_1=1;
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]!=chars[i+1])
            {
                if(sum_1>1)sb.append(sum_1);
                sb.append(chars[i+1]);
                sum_1=0;
            }
            sum_1++;

        }
        if(sum_1>1) sb.append(sum_1);
        String s=sb.toString();
        for(int i=0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }
        return s.length();
    }
}