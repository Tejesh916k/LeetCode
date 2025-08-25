class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int[] vis=new int[rooms.size()];
        dfs(0,rooms,vis);
        for(int i:vis)
        {
            if(i==0) return false;
        }
        return true;

    }
    public void dfs(int node,List<List<Integer>> rooms,int[] vis)
    {
        vis[node]=1;
        for(int i:rooms.get(node))
        {
            if(vis[i]==0)
            {
                dfs(i,rooms,vis);
            }
        }
    }
}