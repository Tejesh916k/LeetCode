class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[] edge:prerequisites)
        {
            adj.get(edge[0]).add(edge[1]);
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
        int[] res=new int[numCourses];
        int j=numCourses-1;
        for(int i=0;i<numCourses;i++)
        {
            if(degree[i]==0)
            {
                q.offer(i);
            }
        }
        while(!q.isEmpty())
        {
            int node=q.poll();
            res[j--]=node;
            for(int i:adj.get(node))
            {
                degree[i]--;
                if(degree[i]==0)
                {
                    q.add(i);
                }
            }

        }
        return j==-1? res:new int[0];
    }
}