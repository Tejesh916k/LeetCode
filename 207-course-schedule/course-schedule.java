class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] i:prerequisites)
        {
            adj.get(i[0]).add(i[1]);
        }
        int[] degree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(int node:adj.get(i))
            {
                degree[node]++;
            }
            
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(degree[i]==0)
            {
                q.offer(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.poll();
            res.add(node);
            for(int i:adj.get(node))
            {
                degree[i]--;
                if(degree[i]==0)
                {
                    q.offer(i);
                }
            }
        }
        if(res.size()==numCourses)
        {
            return true;
        }
        return false;
        
    }
}
 