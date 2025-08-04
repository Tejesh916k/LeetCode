class Solution {
    public int totalFruit(int[] fruits) {
        
        int l=0,maxi=0;
        Map<Integer,Integer> map_1=new HashMap<>();
        for(int i=0;i<fruits.length;i++)
        {
            map_1.put(fruits[i],map_1.getOrDefault(fruits[i],0)+1);
            
                while(map_1.size()>2)
                {
                    map_1.put(fruits[l],map_1.get(fruits[l])-1);
                    if(map_1.get(fruits[l])==0) map_1.remove(fruits[l]);
                    l++;
                }
        
            if(map_1.size()<=2)
            {
                maxi=Math.max(maxi,i-l+1);
            }
            System.out.println(map_1);
        }
        return maxi;
    }
}