class Solution {
     public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        int[] degree =new int[n];

        for(int[] e:edges)
        {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
            degree[e[0]]++;
            degree[e[1]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(degree[i]==1)
            {
                q.add(i);
            }
        }
        for(int i:degree)
        {
            System.out.print(i);
        }
        if(n==1)
        {
            res.add(0);
            return res;
        }
        while(!q.isEmpty())
        {
            res=new ArrayList<>();
            int size=q.size();
            for(int j=0;j<size;j++)
            {                
                int node=q.poll();
                res.add(node);
                for(int i:adj.get(node))
                {
                    degree[i]--;
                    if(degree[i]==1)
                    {
                        q.add(i);
                    }
                }
            }
        }
        
        return res;
    }
}