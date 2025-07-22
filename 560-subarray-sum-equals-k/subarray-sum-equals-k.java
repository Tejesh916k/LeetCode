class Solution {
    public int subarraySum(int[] nums, int k) {
      Map<Integer,Integer> map_1=new HashMap<>();
      int sum=0;
      int count=0;
      map_1.put(0,1);
      for(int i=0;i<nums.length;i++)
      {
         sum+=nums[i];

         if(map_1.containsKey(sum-k))
         {
            count+= map_1.get(sum-k);
         }
         
         map_1.put(sum,map_1.getOrDefault(sum,0)+1);
      }
      return count;
    }
}