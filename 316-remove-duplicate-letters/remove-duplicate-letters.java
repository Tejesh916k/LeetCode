class Solution {
    public String removeDuplicateLetters(String s) {

        int[] arr=new int[26];
        boolean[] bool=new boolean[26];
        Stack<Character> stk=new Stack<>();
        
        for(char c:s.toCharArray())
        {
           arr[c-'a']++;
        }
        for(char c:s.toCharArray())
        {
            arr[c-'a']--;
            if(bool[c-'a'])            
            {
                continue;
            }
            while(!stk.isEmpty() && stk.peek()>c && arr[stk.peek()-'a'] > 0)
            {
                bool[stk.peek()-'a']=false;
                stk.pop();
            }
            stk.push(c);
            bool[c-'a']=true;
            
        }

        StringBuilder sb=new StringBuilder();
        for(char c:stk)
        {
            sb.append(c);

        }
        return sb.toString();
        

        
    }
}