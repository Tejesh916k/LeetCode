class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        int n=events.length,day=0,index=0,result=0;
        while(!pq.isEmpty() || index<n)
        {
            if(pq.isEmpty())
            {
                day=events[index][0];
            }
            while(index<n && events[index][0]<=day)
            {
                pq.offer(events[index][1]);
                index++;
            }

            pq.poll();
            result++;
            day++;
            while(!pq.isEmpty() && pq.peek()<day)
            {
                pq.poll();
            }
            System.out.println(result);
        }
        return result;
    }
}