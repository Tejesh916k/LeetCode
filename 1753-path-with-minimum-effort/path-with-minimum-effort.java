class Pair
{
    int row;
    int col;
    int dist;
    Pair(int row,int col,int dist)
    {
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        int n=heights.length;
        int m=heights[0].length;

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->
        a.dist-b.dist);
        int[][] disArray=new int[n][m];

        for(int[] i:disArray)
        {
            Arrays.fill(i,(int)1e9);
        }
        int[] d_row={0,0,-1,+1};
        int[] d_col={-1,+1,0,0};
        disArray[0][0]=0;
        pq.offer(new Pair(0,0,0));
        while(!pq.isEmpty())
        {
            int row=pq.peek().row;
            int col=pq.peek().col;
            int dist=pq.peek().dist;
            if(row==n-1 && col==m-1) return dist;
            pq.poll();
            for(int i=0;i<4;i++)
            {
                int new_row=row+d_row[i];
                int new_col=col+d_col[i];
                if(new_row>=0 && new_row<n && new_col>=0 && new_col<m)
                {
                    int eff= Math.max(Math.abs(heights[row][col]-heights[new_row][new_col]),dist);
                    if(eff< disArray[new_row][new_col])
                    {
                        disArray[new_row][new_col]=eff;
                        pq.offer(new Pair(new_row,new_col,eff));
                    }
                }
            }
        }
        return 0;
    }
}