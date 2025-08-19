class Pair
{
    int a;
    int b;
    Pair(int _a,int _b)
    {
        this.a=_a;
        this.b=_b;
    }
}
class Solution {
    public boolean exist(char[][] board, String word) {
        Set<Pair> res=new HashSet<>();
    
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                   if (dfs(i,j,0,word,board,res))
                   {
                     return true;
                   }
                }
            }
        }
        return false;
    }
    public boolean dfs(int r,int c,int pos,String sb,char[][] board,
    Set<Pair> res)
    {
        int n=board.length;
        int m=board[0].length;
        if(pos==sb.length())
        {
            return true;
        }
        if(r<0 || r>=n || c<0 || c>=m || sb.charAt(pos)!=board[r][c] )
        {
            return false;
        }
        char temp=board[r][c];
        board[r][c]='-';
        boolean find=(dfs(r+1,c,pos+1,sb,board,res) || dfs(r-1,c,pos+1,sb,board,res) || dfs(r,c+1,pos+1,sb,board,res) || dfs(r,c-1,pos+1,sb,board,res));

        board[r][c]=temp;
        return find;
    }

}