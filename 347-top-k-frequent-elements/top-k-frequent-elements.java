class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map_1=new HashMap<>();
        List<Integer> list_1=new ArrayList<>();
        for(int i:nums)
        {
            map_1.put(i,map_1.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> min_heap=
        new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> e:map_1.entrySet())
        {
            min_heap.offer(e);
            if(min_heap.size()>k)
            {
                min_heap.poll();
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=min_heap.poll().getKey();
        }
        return res;
        
    }
}