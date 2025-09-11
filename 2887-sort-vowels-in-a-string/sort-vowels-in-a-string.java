class Solution {
    public String sortVowels(String s) {
        List<Character> list_1=new ArrayList<>();
        Set<Character> vowels=Set.of('a','e','i','o','u');
        for(char c:s.toCharArray())
        {
            char ch=Character.toLowerCase(c);
            if(vowels.contains(ch))
            {
                list_1.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        Collections.sort(list_1);
        for(char c:s.toCharArray())
        {
            char ch=Character.toLowerCase(c);
            if(vowels.contains(ch))
            {
                sb.append(list_1.get(j++));
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}