class Solution {
    public int[] avoidFlood(int[] rains) {
        
        int n=rains.length;
        int[] res=new int[n];
        Map<Integer,Integer> map_1=new HashMap<>();
        TreeSet<Integer> days=new TreeSet<>();
        for (int i=0;i<n;i++)
        {            
            if(rains[i]==0 )
            {
                days.add(i);
                res[i]=1;
            }

            else
            {
                res[i]=-1;
                int lake=rains[i];
                
                if(map_1.containsKey(lake))
                {
                    int x=map_1.get(lake);
                    Integer day=days.higher(x);
                    if(day==null) return new int[0];
                    res[day]=lake;
                    days.remove(day);
                }
                map_1.put(lake,i);
            }
        }
        return res;
    }
}