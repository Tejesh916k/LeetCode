class Solution {
    public boolean isValid(String word) {
        String vow="aeiouAEIOU";
        boolean conso=false;
        boolean vowel=false;
        if(word.length()<3)
        {
            return false;
        }
        for(char c:word.toCharArray())
        {
            if(!Character.isLetter(c) && !Character.isDigit(c))
            {
                return false;
            }
            else if(Character.isLetter(c))
            {
                int i=vow.indexOf(c);
                if(i==-1)
                {
                    conso=true;
                }
                else
                {
                    vowel=true;
                }
            }
        }
        return  vowel && conso;
    }
}