class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int arrow=1;
        int pos=points[0][1];

        for(int[] i:points)
        {
            if(i[0]>pos)
            {
                arrow++;
                pos=i[1];
            }
        }
        return arrow;


    }
}