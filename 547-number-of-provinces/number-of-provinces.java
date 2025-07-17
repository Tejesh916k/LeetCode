class Solution {
    public static void dfs(int[][] graph, int curr,int []visited ){

        visited[curr]=1;
        for (int j=0;j<graph.length;j++)
        {
            if(visited[j]==0 && graph[curr][j]==1)
            {
                dfs(graph,j,visited);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        
        int[] visited=new int[isConnected.length];
        int n=isConnected.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                dfs(isConnected,i,visited);
                count++;
            }

        }
        return count;
    }
}