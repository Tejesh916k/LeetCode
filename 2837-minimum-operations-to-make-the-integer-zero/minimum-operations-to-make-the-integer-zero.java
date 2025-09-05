class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        
        for(int i=1;i<60;i++)
        {
            Long tar=(long)num1 - (long) i*num2;
            if(tar<i) continue;
            if(Long.bitCount(tar)<=i) return i;
        }
        return -1;
    }
}