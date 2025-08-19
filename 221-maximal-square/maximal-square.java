class Solution {
    public int maximalSquare(char[][] matrix) {
        int flag=0;
        int[][] vis=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]=='1')
            {
                vis[i][0]=1;
                flag=1;
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[0][i]=='1')
            {
                vis[0][i]=1;
                flag=1;
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
               if(matrix[i][j]=='1') {vis[i][j]=1+Math.min(vis[i-1][j-1],Math.min(vis[i-1][j],vis[i][j-1]));
                flag=Math.max(flag,vis[i][j]);}
            }
        }
        return flag*flag;
        
    }
   
}