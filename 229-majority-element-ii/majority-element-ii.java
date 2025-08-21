class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int base=nums.length/3;
        Map<Integer,Integer> map_1=new HashMap<>();

        for(int i:nums)
        {
            map_1.put(i,map_1.getOrDefault(i,0)+1);
        }
        List<Integer> list_1=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map_1.entrySet())
        {
            if(e.getValue()>base)
            {
                list_1.add(e.getKey());
            }
        }
        return list_1;
    }
}