class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map_1=new HashMap<>();
        List<Integer> list_1=new ArrayList<>();
        for(int i:nums)
        {
            map_1.put(i,map_1.getOrDefault(i,0)+1);
        }
        int[] res=new int[k];
        int j=0;
        while(j<k)
        {
            int i=Collections.max(map_1.values());
            for(Map.Entry<Integer,Integer> e:map_1.entrySet())
            {
                if(e.getValue()==i)
                {
                    res[j]=e.getKey();
                    map_1.remove(res[j]);
                    break;
                }              
            }
            j++;
        }
        return res;
    }
}