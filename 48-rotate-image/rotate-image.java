class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i==j) continue;
                transpose(i,j,matrix);
            }
        }
        for(int i=0;i<n;i++)
        {
            int j=0;
            int k=n-1;
            while(j<k)
            {
                transform(i,j,k,matrix);
                j++;
                k--;
            }
        }

    }
    public void transpose(int row,int col,int[][] matrix)
    {
        int ele=matrix[row][col];
        matrix[row][col]=matrix[col][row];
        matrix[col][row]=ele;
    }
    public void transform(int i,int row,int col,int[][] matrix)
    {
        int sam=matrix[i][row];
        matrix[i][row]=matrix[i][col];
        matrix[i][col]=sam;
    }

}