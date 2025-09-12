class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] grid=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(grid[i],'.');
        }
        backtrack(0,n,grid,res);
        return res;
    }
    public void backtrack(int col,int n,char[][] grid,List<List<String>> res)
    {
        if(col==n)
        {
            res.add(construct(grid));
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(check(row,col,grid,n))
            {
                grid[row][col]='Q';
                backtrack(col+1,n,grid,res);
                grid[row][col]='.';
            }
        }
    }
    public boolean check(int row,int col,char[][] grid,int n)
    {
        for(int j=col;j>=0;j--)
        {
            if(grid[row][j]=='Q')
            return false;
        }
        for(int i=row,j=col;i>=0 &&j>=0;i--,j--)
        {
            if(grid[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i<n&&j>=0;i++,j--)
        {
            if(grid[i][j]=='Q') return false;
        }
        return true;
    }
    public List<String> construct(char[][] grid)
    {
        List<String> result=new ArrayList<>();
        for(char[] ch:grid)
        {
            result.add(new String(ch));
        }
        return result;
    }
}