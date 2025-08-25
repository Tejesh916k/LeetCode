class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer,List<int[]>> graph=new HashMap<>();
        for(int[] i:times)
        {
            int src=i[0];
            int dest=i[1];
            int cost=i[2];
            if(!graph.containsKey(src))
            {
                graph.put(src,new ArrayList<>());
            }
            graph.get(src).add(new int[]{dest,cost});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->
        a[1]-b[1]);
        pq.offer(new int[]{k,0});
        Map<Integer,Integer> f=new HashMap<>();

        while(!pq.isEmpty())
        {
            int[] i=pq.poll();
            int node=i[0];
            int val=i[1];
            if(f.containsKey(node)) continue;
            f.put(node,val);
            if(graph.containsKey(node))
            {
                for(int[] nei:graph.get(node))
                {
                    int neiVal=nei[0];
                    int neiDist=nei[1];
                    if(!f.containsKey(neiVal))
                    {
                        pq.offer(new int[]{neiVal,val+neiDist});
                    }
                }
            }
        }
        if(f.size()<n) return -1;
        int time=0;
        for(int i:f.values())
        {
           time= Math.max(time,i);
        }
        return time;
    }
}