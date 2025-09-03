class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int n=arr.length;
        int[] nle=new int[n];
        int[] pse=new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i])
            {
                stk.pop();
            }
            pse[i]=stk.isEmpty() ? -1:stk.peek();
            stk.push(i);

        }
        stk.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i])
            {
                stk.pop();
            }
            nle[i]=stk.isEmpty() ? n:stk.peek();
            stk.push(i);
        }

        long res=0;
        int mod=(int)1e9 + 7;
        for(int i=0;i<n;i++)
        {
            long count=(long)((i-pse[i]) * (nle[i]-i));
            res=(res+ (long)arr[i]*count)%mod;
        }

        for(int i:pse) System.out.print(i);
        for(int i:nle) System.out.print(i);
        return (int) res;
    }


}