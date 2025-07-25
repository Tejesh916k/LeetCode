class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;

        for (int bill : bills) {
            if (bill == 5) {
                f++;
            } else if (bill == 10) {
                if (f == 0) return false;
                f--;
                t++;
            } else { 
                if (t > 0 && f > 0) {
                    t--;
                    f--;
                } else if (f >= 3) {
                    f -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}