class Solution {
    public int countSubstrings(String s) {
        int count_1=0;
        int count_2=0;
        String palindrome="";
        for(int i=0;i<s.length();i++)
        {
            int l=i;
            int r=i;
            while(s.charAt(l)==s.charAt(r))
            {
                System.out.println(i);
                count_1++;
                l--;
                r++;
                if(l<0 || r>s.length()-1)
                {
                    break;
                }
                
            }
        }


        for(int i=0;i<s.length()-1;i++)
        {
            int l=i;
            int r=i+1;
            while(s.charAt(l)==s.charAt(r))
            {
                count_2++;
                l--;
                r++;
                if(l<0 || r>s.length()-1) break;
            }          
            
        }

        return count_1+count_2;
    }
}