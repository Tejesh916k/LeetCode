class Solution {
    public void dfs(int row,int col,int[][] vis,char[][] mat)
    {
        int n=mat.length;
       int m=mat[0].length;
        int[] d_row={0,0,+1,-1};
        int [] d_col={+1,-1,0,0};
        vis[row][col]=1;
        for(int i=0;i<4;i++)
        {
            int e_row=row+d_row[i];
            int e_col=col+d_col[i];
            if( e_row>=0 && e_row<n && e_col<m && e_col>=0 && vis[e_row][e_col]==0 && mat[e_row][e_col]=='O')
            {
                dfs(e_row,e_col,vis,mat);
            }
        }
    }

    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];

        for(int i=0;i<m;i++)
        {
            if(vis[0][i]==0 && board[0][i]=='O')
            {
                dfs(0,i,vis,board);
            }
            if(vis[n-1][i]==0 && board[n-1][i]=='O')
            {
                dfs(n-1,i,vis,board);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i][0]==0 && board[i][0]=='O')
            {
                dfs(i,0,vis,board);
            }
            if(vis[i][m-1]==0 && board[i][m-1]=='O')
            {
                dfs(i,m-1,vis,board);
            }
        }

        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(vis[i][j]==0 && board[i][j]=='O')
                {
                    board[i][j]='X';
                }
            }
        }
    }
}



