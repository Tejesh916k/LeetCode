class Solution {
    public long minCost(int[] basket1, int[] basket2) {
       List<Integer> list_1=new ArrayList<>();
        Map<Integer,Integer> map_1=new HashMap<>();
       for(int i:basket1) map_1.put(i,map_1.getOrDefault(i,0)+1);
        for(int i:basket2) map_1.put(i,map_1.getOrDefault(i,0)-1);
        System.out.println(map_1);

        int mini=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> e:map_1.entrySet())
        {
            int diff=e.getValue();
            if(diff%2!=0) return -1;

            mini=Math.min(mini,e.getKey());
            for(int i=0;i<Math.abs(diff)/2;i++)
            {
                list_1.add(e.getKey());
            }
        }
        Collections.sort(list_1);
        long val=0;
        for(int i=0;i<list_1.size()/2;i++)
        {
            val+=Math.min(list_1.get(i),mini*2);
        }

        return val;
    }
}