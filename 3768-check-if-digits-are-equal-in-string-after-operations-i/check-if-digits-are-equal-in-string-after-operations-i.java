class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length()==2){
            return s.charAt(0)==s.charAt(1);
        }
        String j="";
        for(int i=1;i<s.length();i++)
        {
            int first=(int)s.charAt(i-1);
            int sec=(int)s.charAt(i);
            int sum=(first+sec)%10;

            j+=(char)sum;

        }
      return hasSameDigits(j); 
       
    }
}