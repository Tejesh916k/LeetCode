class Solution {
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] vis=new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            vis[i]=-1;
        }
        for(int i=0;i<graph.length;i++)
        {
            if(vis[i]==-1)
            {
               if(bipartite(i,graph.length,vis,graph)== false) 
               return false;
            }
        }
        return true;
    }
        
        public boolean bipartite(int start,int v,int[] vis,int[][] graph)
        {
            Queue<Integer> q=new LinkedList<>();
            q.add(start);
            vis[start]=0;
            while(!q.isEmpty())
            {
                int node=q.peek();
                q.poll();
                for(int i:graph[node])
            {
                if(vis[i]==-1)
                {
                    vis[i]=1-vis[node];
                    q.add(i);
                }
                else if(vis[i]==vis[node])
                {
                    return false;
                }
            }
        }
        return true;
        }
    }
