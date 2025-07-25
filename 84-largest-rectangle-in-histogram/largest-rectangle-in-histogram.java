class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int [] > stk=new Stack<>();
        int maxi=0;
        for(int i=0;i<heights.length;i++)
        {
            int start=i;
            while(!stk.isEmpty() && stk.peek()[1]>heights[i])
            {
                int[] drop=stk.pop();
                int ind=drop[0];
                int val=drop[1];
                maxi=Math.max(maxi,(i-ind)*val);
                start=ind;
            }
            stk.push(new int[] {start,heights[i]});
           
        }
        
        for(int [] pair:stk)
        {
            int ind=pair[0];
            int val=pair[1];
            maxi=Math.max(maxi,(heights.length-ind)*val);
        }
        return maxi;
    }
}