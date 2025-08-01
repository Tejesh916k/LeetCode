class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map_1=new HashMap<>();

        for(char c:s.toCharArray())
        {
            map_1.put(c,map_1.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> heap=
        new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> e:map_1.entrySet())
        {
            heap.offer(e);
        }
        StringBuilder sb=new StringBuilder();
        while(!heap.isEmpty())
        {
            int repeat=heap.peek().getValue();
            char str=heap.poll().getKey();
            while(repeat>0)
            {
                sb.append(str);
                repeat--;
            }
        }

        return sb.toString();
        
    }
}