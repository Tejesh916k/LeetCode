class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int l=operations.length;
        int c1=0;
        int c2=0;
        StringBuilder s= new StringBuilder();
        for(int i=0;i<l;i++)
        {   
            String s1=operations[i];
            if(s1.equals("++X") ||s1.equals("X++") )
            {
                c1++;
            }
            else
            {
                c2--;
            }
        }
        int result=c1+c2;
        return result;
    }
}