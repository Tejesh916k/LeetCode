class Solution {
    public int maxSumDivThree(int[] nums) {
        
        Arrays.sort(nums);
        int total=0;
        List<Integer> rem1=new ArrayList<>();
        List<Integer> rem2=new ArrayList<>();
        for(int i:nums)
        {
            total+=i;
            if(i%3==1) rem1.add(i);
            if(i%3==2) rem2.add(i);

        }
        if(total%3==0) return total;
        int sum_1=0;
        int sum_2=0;
        if(total%3==1)
        {
            if(!rem1.isEmpty()) sum_1=total-rem1.get(0);
            if(rem2.size()>1) sum_2=total-(rem2.get(0)+rem2.get(1));

        }
        else if(total%3==2)
        {
            if(!rem2.isEmpty()) sum_1=total-rem2.get(0);
            if(rem1.size()>1) sum_2=total-(rem1.get(0)+rem1.get(1));
        }
        System.out.print(total);
        return Math.max(sum_1,sum_2);
    }
}