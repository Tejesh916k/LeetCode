class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if((n==r && m==c) || (r*c != n*m)) return mat;
        int[][] matrix=new int[r][c];
        int ind_1=0;
        int ind_2=0;
        while(ind_1< r*c  &&  ind_2< n*m)
        {
            matrix[ind_1/c][ind_1%c]=mat[ind_2/m][ind_2%m];
            ind_1++;
            ind_2++;

        } 
        
        return matrix;

    }
}