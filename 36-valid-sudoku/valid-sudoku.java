
class Solution {

    public static boolean isPossible(char[][] board,int row,int col)
    {
        for(int i = 0;i<9;i++)
        {
            
            if( i != row && board[i][col] == board[row][col])return false;

            if( i != col && board[row][i] == board[row][col])return false;

            int rowPos = (3 * (row/3) + (i/3));
            int colPos = 3*(col/3)+(i%3);
            if((rowPos != row && colPos != col) && board[rowPos][colPos] == board[row][col])return false;
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