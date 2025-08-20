class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean left = true;
        boolean right = true;

        for (int j = 0; j < cols; j++) {
            if (!check(0, j, matrix)) {
                left = false;
                break;
            }
        }

       
        for (int i = 1; i < rows; i++) {
            if (!check(i, 0, matrix)) {
                right = false;
                break;
            }
        }

        return left && right;
    }

    public boolean check(int row, int col, int[][] matrix) {

        while (row < matrix.length - 1 && col < matrix[0].length- 1) {
            if (matrix[row][col] != matrix[row + 1][col + 1]) {
                return false;
            }
            row++;
            col++;
        }
        return true;
    }
}