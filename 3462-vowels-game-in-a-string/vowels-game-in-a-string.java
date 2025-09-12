class Solution {
    public boolean doesAliceWin(String s) {
        int vowCount=0;
        Set<Character> vowel=Set.of('a','e','i','o','u');
        for(char c:s.toCharArray())
        {
            if(vowel.contains(c)) vowCount++;
        }
        System.out.println(vowCount);
        if(vowCount==0) return false;
        return true;
    }
}