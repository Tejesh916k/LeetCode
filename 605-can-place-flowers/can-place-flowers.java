class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=1;
        if(n==0)
        {
            return true;
        }
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count==3)
            {
                n--;
                count=1;
                if(n==0)
                {
                    return true;
                }

            }
        }
        if(count==2 && n==1)
        {
            return true;
        }
        return false;
    }
}