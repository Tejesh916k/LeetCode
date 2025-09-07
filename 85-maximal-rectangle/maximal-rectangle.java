class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxi=0;
        int[] rect=new int[matrix[0].length];
        Arrays.fill(rect,0);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1') rect[j]++;
                else rect[j]=0;
            }
            int area=stackFunc(rect);
            maxi=Math.max(maxi,area);
        }
        

        return maxi;
    }
    public int stackFunc(int[] histo)
    {
        int maxi=0;
        int n=histo.length;
        Stack<int[]> stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            int start=i;
            while(!stk.isEmpty() && stk.peek()[1]>histo[i])
            {
                int ind=stk.peek()[0];
                int val=stk.peek()[1];
                stk.pop();
                maxi=Math.max(maxi, (i-ind) * val);
                start=ind;
            }
            stk.push(new int[]{start,histo[i]});
        }
        for(int[] p:stk)
        {
            int ind=p[0];
            int val=p[1];
            maxi=Math.max(maxi,(n-ind)*val);
        }
        return maxi;
    }
}