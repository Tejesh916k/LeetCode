class Solution {
    public void solveSudoku(char[][] board) {
        sudoko(board);
    }
    public boolean sudoko(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(solver(ch,i,j,board))
                        {
                            board[i][j]=ch;
                            if(sudoko(board)) return true;
                            board[i][j]='.';
                        }
                    }
                  return false;
                }
            }
        }
        return true;
    }
    public boolean solver(char ch,int row,int col,char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==ch || board[i][col]==ch) return false;
            int row_pos= (3* (row/3))+(i/3);
            int col_pos= (3 * (col/3))+(i%3);

            if(board[row_pos][col_pos]==ch) return false;

        }
        return true;
    }
}