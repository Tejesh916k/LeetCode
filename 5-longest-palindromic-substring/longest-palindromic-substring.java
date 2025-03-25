class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        {
            return s;
        }
        String palindrome="";
        for (int i=1;i<s.length();i++)
        {
            int l=i;
            int h=i;
            while(s.charAt(l)==s.charAt(h))
            {
                l--;
                h++;
                if((l==-1) || h==s.length())
                {
                    break;
                }
                

            }
            String curr_palindrome=s.substring(l+1,h);
            if(curr_palindrome.length()>palindrome.length())
            {
                palindrome=curr_palindrome;
            }
                
            l=i-1;
            h=i;
            while(s.charAt(l)==s.charAt(h))
            {
                l--;
                h++;
                if((l==-1) || h==s.length())
                {
                    break;
                }
                

            }
            curr_palindrome=s.substring(l+1,h);
            if(curr_palindrome.length()>palindrome.length())
            {
                palindrome=curr_palindrome;
            }
        }
        return palindrome;
    }
}