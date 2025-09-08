class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        
        for(int a=1;a<n;a++)
        {
            int b=n-a;
            if(validFunc(a) && validFunc(b))
            {
                res[0]=a;
                res[1]=b;
                return res;
            }
        }
        return res;
    }
    public boolean validFunc(int num)
    {
        while(num>0)
        {
            if(num%10==0) return false;
            num=num/10;
        }
        return true;
    }
}