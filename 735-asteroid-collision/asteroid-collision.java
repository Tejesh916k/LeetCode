class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int flag=1;
            while(flag==1 && !stk.isEmpty() && stk.peek()>0 && nums[i]<0)
            {
                int top=stk.peek();
                if(top< -nums[i])
                {
                    stk.pop();
                }
                else if(top == -nums[i]) 
                {
                    flag=0;
                    stk.pop();
                }
                else
                {
                    flag=0;
                }
            }
            
            if(flag==1) stk.push(nums[i]);
        }

          n=stk.size();
            int[] res=new int[n];
            while(!stk.isEmpty())
            {
                res[stk.size()-1]=stk.pop();
            }
        return res;
    }
}