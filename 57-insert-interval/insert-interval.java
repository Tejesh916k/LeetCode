class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int new_i=newInterval[0];
        int new_j=newInterval[1];
        int n=intervals.length;
        List<int[]> res=new ArrayList<>();
        for(int[] i:intervals)
        {
            if (new_j < i[0]) {
                res.add(new int[]{new_i, new_j});
                new_i = i[0];
                new_j = i[1];
            } else if (new_i > i[1]) {
                res.add(i);
            } else {
                new_i = Math.min(new_i, i[0]);
                new_j = Math.max(new_j, i[1]);
            }

        }
        res.add(new int[]{new_i, new_j});
        return res.toArray(new int[res.size()][2]);

    }
}