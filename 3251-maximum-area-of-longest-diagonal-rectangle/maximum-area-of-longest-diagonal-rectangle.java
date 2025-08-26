class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diag_length=0.0;
        int m_area=0;
        for(int[] i:dimensions)
        {
            double curr_diag = Math.sqrt(i[0] * i[0] + i[1] * i[1]);
            int area=i[0]*i[1];
            if(curr_diag>diag_length || (curr_diag==diag_length && area>m_area) )
            {
                diag_length=curr_diag;
                m_area=area;
            }

        }
        return m_area;
    }
}