class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
        int j=-1;
        Arrays.sort(trainers);
        Arrays.sort(players);
        for(int i=0;i<players.length;i++)
        {
            while(j<trainers.length-1)
            {
                j++;
                if(players[i]<=trainers[j])
                {
                    count++;
                    break;
                }
                
                
            }
        }
        return count;
    }
}