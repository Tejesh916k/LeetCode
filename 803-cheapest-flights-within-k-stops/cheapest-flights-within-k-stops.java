class Details
{
    int dest;
    int dist;
    int steps;
    Details(int dest,int dist,int steps)
    {
        this.dest=dest;
        this.steps=steps;
        this.dist=dist;
    }
}
class Pair
{
    int node;
    int dist;
    Pair(int node,int dist)
    {
        this.node=node;
        this.dist=dist;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] i:flights)
        {
            int s=i[0];
            int d=i[1];
            int wt=i[2];
            adj.get(s).add(new Pair(d,wt));
        }
        Queue<Details> q=new LinkedList<>();

        int[] disArray=new int[n];
        Arrays.fill(disArray,(int)1e9);
        disArray[src]=0;
        q.add(new Details(src,0,0));
        while(!q.isEmpty())
        {
            Details d=q.poll();
            int node=d.dest;
            int dist=d.dist;
            int steps=d.steps;
            if(steps>k) continue;
            for(Pair p:adj.get(node))
            {
                int source=p.node;
                int trav_dist=p.dist;
                if(trav_dist+dist < disArray[source] && steps<=k )
                {
                    disArray[source]=trav_dist+dist;
                    q.offer(new Details(source,trav_dist+dist,steps+1));
                }
            }
        }
        if(disArray[dst]==(int)1e9) return -1;

        return disArray[dst];

    }
}