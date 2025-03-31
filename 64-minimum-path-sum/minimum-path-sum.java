class Solution {
    public int minPathSum(int[][] grid) {
        int [][] matrix=new int[grid.length][grid[0].length];
        matrix[0][0]=grid[0][0];
        for(int i=1;i<grid[0].length;i++)
        {
            matrix[0][i]=matrix[0][i-1]+grid[0][i];
        }
        for(int j=1;j<grid.length;j++)
        {
            matrix[j][0]=matrix[j-1][0]+grid[j][0];
        }
        for(int i=1;i<grid.length;i++)
        {
            for(int j=1;j<grid[0].length;j++)
            {
                matrix[i][j]=Math.min(matrix[i][j-1],matrix[i-1][j])+grid[i][j];
            }
        }
        return matrix[grid.length-1][grid[0].length-1];
    }
}