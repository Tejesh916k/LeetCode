class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] arr =new int[t.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<t.length;i++)
        {
            while(!stk.isEmpty() && t[stk.peek()]<t[i])
            {
                arr[stk.peek()]=i-stk.pop();
            }
            stk.push(i);
        }
        return arr;
    }
}