class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] mat=new int[n][m];
        int sum=0;

        for(int i=0;i<m;i++) {
            mat[0][i]=matrix[0][i];
            sum+=matrix[0][i];
            }
           
        for(int i=1;i<n;i++) {
            mat[i][0]=matrix[i][0];
             sum+=matrix[i][0];
           
            }
            

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==1){

                mat[i][j]=1+Math.min(mat[i-1][j-1],Math.min(mat[i][j-1],mat[i-1][j]));
                sum+=mat[i][j];
                }
            }
        }
        
        
       
      return sum;  
    }
}