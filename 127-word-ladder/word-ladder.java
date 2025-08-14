class Pair
{
    String word;
    int value;
    Pair(String _word,int _value)
    {
        this.word=_word;
        this.value=_value;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set_1=new HashSet<>();
        for(String s:wordList)
        {
            set_1.add(s);

        }
        set_1.remove(beginWord);
        q.add(new Pair(beginWord,1));

        while(!q.isEmpty())
        {
            String word=q.peek().word;
            int value=q.poll().value;
            if(word.equals(endWord)) return value;
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char[] chr=word.toCharArray();
                    chr[i]=ch;
                    String new_word=new String(chr);
                    if(set_1.contains(new_word))
                    {
                        set_1.remove(new_word);
                        q.add(new Pair(new_word,value+1));
                    }
                }
                
            }
        }
        return 0;

    }
}