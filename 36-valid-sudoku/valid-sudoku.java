
class Solution {

    public static boolean isPossible(char[][] board,int row,int col)
    {
        for(int i=0;i<9;i++)
        {
            if(i!=row && board[i][col]==board[row][col]) return false;
            if(i!=col && board[row][i]==board[row][col]) return false;

            int row_pos= (3 * (row/3) + i/3);
            int col_pos=(3 * (col/3) + i%3);
            if((row_pos!=row && col_pos!=col) && board[row][col]==board[row_pos][col_pos]) return false;
        
        }
        
        
        return true;
        
        
    }

    public static boolean sudoku(char[][] board)
    {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                if(board[i][j] != '.') 
                {
                        if(!isPossible(board,i,j))
                        {
                            return false;
                        }
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        return sudoku(board);
    }
}