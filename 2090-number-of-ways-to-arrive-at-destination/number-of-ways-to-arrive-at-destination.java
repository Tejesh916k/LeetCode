class Pair
{
    int node;
    long dist;
    Pair(int node,long dist)
    {
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] i:roads)
        {
            int src=i[0];
            int dest=i[1];
            long dist=i[2];

            adj.get(src).add(new Pair(dest,dist));
            adj.get(dest).add(new Pair(src,dist));
        }
        long[][] distArr=new long[n][2];
        for(int i=0;i<n;i++)
        {
            distArr[i][0]=Long.MAX_VALUE;
            distArr[i][1]=0;
        }
        distArr[0][0]=0;
        distArr[0][1]=1;
PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));
        pq.add(new Pair(0,0));
        int mod=(int)(1e9+7);
        while(!pq.isEmpty())
        {
            int node=pq.peek().node;
            long dist=pq.peek().dist;
            pq.poll();
            for(Pair p:adj.get(node))
            {
                int dest=p.node;
                long trav=p.dist;
                if( dist+trav == distArr[dest][0])
                {
                    distArr[dest][1]=(distArr[dest][1]+distArr[node][1])%mod;
                }
                else if(dist+trav < distArr[dest][0])
                {
                    distArr[dest][0]=dist+trav;
                    pq.offer(new Pair(dest,dist+trav));
                    distArr[dest][1]=distArr[node][1];
                }
            }
            
        }
        
        return (int)(distArr[n-1][1]%mod);
    }
}