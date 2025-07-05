class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        System.out.println(h1);
        int[] arr1 =new int[arr.length];
        int maxi=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==h1.get(arr[i]) && arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }
        return maxi;
    }
}