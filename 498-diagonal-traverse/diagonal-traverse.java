class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        int flag=0;
        int r=0;
        int c=0;
        int z=0;
        int[] res=new int[n*m];
        for(int i=0;i<(n+m)-1;i++)
        {
            if(flag==0)
            {
                while(r>=0 && c<m)
                {
                    res[z++]=mat[r--][c++];
                }
                r++;
                c--;
                 if (c + 1 < m) {
                    c++;
                } else {
                    r++;
                }

                flag=1;
            }
            if(flag==1)
            {
                while(r<n && c>=0)
                {
                    res[z++]=mat[r++][c--];
                }
                r--;
                c++;
                if (r + 1 < n) {
                    r++;
                } else {
                    c++;
                }

                flag=0;
            }
        }
        return res;
    }
}