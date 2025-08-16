class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int maxi=0;
        List<List<Integer>> revAdj=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        int[] degree=new int[graph.length];
        for(int i=0;i<graph.length;i++) revAdj.add(new ArrayList<>());
        for(int i=0;i<graph.length;i++)
        {
            for(int j:graph[i])
            {
                revAdj.get(j).add(i);
                degree[i]++;
            }
        }
        for(int i=0;i<degree.length;i++)
        {
            if(degree[i]==0)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int node=q.peek();
            res.add(node);
            q.poll();
            for(int i:revAdj.get(node))
            {
                degree[i]--;
                if(degree[i]==0) q.add(i);
            }
        }
        Collections.sort(res);
        return res;
        
    }
}