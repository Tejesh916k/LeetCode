class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res=new HashSet<>();
        Set<Integer> res_2=new HashSet<>();

        for(int i:arr)
        {
        Set<Integer> curr=new HashSet<>();
        curr.add(i);
        for(int j:res_2)
        {
            curr.add(j|i);
        }
        res.addAll(curr);
        res_2=curr;

        }
       return res.size();
}
    
}