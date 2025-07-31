class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        {
            return 1;
        }
        long exp=n;
        if(n<0)
        {
            x=1/x;
            exp=-exp;
        }
        return find(x,exp);
    }
    public double find(double x,long exp)
    {
        if(exp==0)
        {
            return 1;
        }
        double curr=find(x,exp/2);
        if(exp%2==0)
        {
            return curr*curr;
        }
        else
        {
            return curr*curr*x;
        }
        
    }

}