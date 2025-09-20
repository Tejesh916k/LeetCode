class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        if(k==1)
        {
            return matrix[0][0];
        }
        if(k==(n*n))
        {
            return matrix[n-1][n-1];
        }
        int l=matrix[0][0];
        int h=matrix[n-1][n-1];
        while(l<h)
        {
            int mid=l+(h-l)/2;
            int count=func(matrix,mid);
            if(count<k)
            {
                l=mid+1;
            }
            else
            {
                h=mid;
            }

        }
        return l;
        
    }
    public int func(int[][] matrix, int mid)
    {
        int count=0;
        int n=matrix.length;
        int row=n-1;
        int col=0;
        while(row>=0 && col<n)
        {
            if(matrix[row][col]<=mid)
            {
                count+=row+1;
                col++;
            }
            else
            {
                row--;
            }
        }
        return count;
    }
}