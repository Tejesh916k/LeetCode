class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] dup=image;
        int ini_col=image[sr][sc];
        int []del_rows={0,0,+1,-1};
        int []del_cols={+1,-1,0,0};
        dfs(del_rows,del_cols,ini_col,color,dup,image,sr,sc);
        return dup;

    }
    public void dfs(int[] d_rows,int[] d_cols,int ini_col,int color,int[][]
    dup,int[][] image,int sr,int sc)
    {
        dup[sr][sc]=color;
        int n=dup.length;
        int m=dup[0].length;
        for(int i=0;i<4;i++)
        {
           int e_row=sr+d_rows[i];
            int e_col=sc+d_cols[i];
            if(e_row<n && e_row>=0 && e_col<m && e_col>=0
            && image[e_row][e_col]==ini_col && dup[e_row][e_col]!=color)
            {
                dfs(d_rows,d_cols,ini_col,color,dup,image,e_row,e_col);
            }
        }
    }

}