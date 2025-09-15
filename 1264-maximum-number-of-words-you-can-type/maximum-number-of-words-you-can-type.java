class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] letter=new int[26];
        Arrays.fill(letter,1);
        for(char c:brokenLetters.toCharArray())
        {
            int a=c-'a';
            letter[a]=0;
        }
        String[] st=text.split(" ");
        int count=st.length;
        for(String s:st)
        {
            for(char c:s.toCharArray())
            {
                int ch=c-'a';
                if(letter[ch]==0)
                {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}