class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list_1=new ArrayList<>();
        int left=0,top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                list_1.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                list_1.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list_1.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list_1.add(matrix[i][left]);
                }
                left++;
            }
        }
       return list_1; 
    }
}