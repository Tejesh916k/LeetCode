class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list_1=new ArrayList<>();        
        System.out.println(list_1);
        for(int i=0;i<numRows;i++)
        {
            int[] arr=new int[i+1];
            arr[0]=1;
            arr[i]=1;
            for(int j=1;j<i;j++)
            {
                arr[j]=list_1.get(i-1).get(j-1)+list_1.get(i-1).get(j);
            }
            List<Integer> sample=new ArrayList<>();
            for(int num:arr)
            {
                sample.add(num);
            }
            list_1.add(sample);
        }
        return list_1;

    }
}