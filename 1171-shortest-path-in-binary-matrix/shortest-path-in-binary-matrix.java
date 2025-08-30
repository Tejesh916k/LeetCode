class Pair
{
    int dist;
    int row;
    int col;
    Pair(int dist,int row,int col)
    {
        this.dist=dist;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1) return -1;
        int[][] distArr=new int[n][n];
        for(int[] i:distArr)
        {
            Arrays.fill(i,(int)1e9);
        }
        distArr[0][0]=1;
        Queue<Pair> q=new LinkedList<>();
        
        int[] d_row={-1,-1,-1,0,0,+1,+1,+1};
        int[] d_col={-1,0,+1,-1,+1,-1,0,+1};

        q.offer(new Pair(1,0,0));
        while(!q.isEmpty())
        {
            int dist=q.peek().dist;
            int row=q.peek().row;
            int col=q.peek().col;
            if(row==n-1 && col==n-1) return dist;
            q.poll();
            for(int i=0;i<8;i++)
            {
                int n_row=row+d_row[i];
                int n_col=col+d_col[i];

                if(n_row>=0 && n_row<n && n_col>=0 && n_col<n && grid[n_row][n_col]==0 && distArr[n_row][n_col]>1+dist)
                {
                    distArr[n_row][n_col]=1+dist;
                    q.offer(new Pair(dist+1,n_row,n_col));
                }
            }
        }
        return -1;
    }
}