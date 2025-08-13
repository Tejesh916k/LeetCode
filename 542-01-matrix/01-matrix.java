class Pair
{
    int row;
    int col;
    int dist;
    Pair(int _row,int _col,int _dist)
    {
        this.row=_row;
        this.col=_col;
        this.dist=_dist;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[mat.length][mat[0].length];
        int[][] dup=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                else
                {
                    vis[i][j]=0;
                }
            }
        }
        
        int[] d_row={0,0,-1,+1};
        int[] d_col={+1,-1,0,0};
        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int dist=q.peek().dist;
            q.remove();
            dup[row][col]=dist;
            for(int i=0;i<4;i++)
            {
               int e_row=row+d_row[i];
               int e_col=col+d_col[i];
                if(e_row>=0 && e_row<n && e_col>=0 && e_col<m
                && vis[e_row][e_col]==0)
                {
                    vis[e_row][e_col]=1;
                    q.add(new Pair(e_row,e_col,dist+1));
                }
            }
        }
        return dup;
    }
}