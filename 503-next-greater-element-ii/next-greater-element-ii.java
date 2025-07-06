class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        int n=nums.length;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<2*n;i++)
        {
            int curr=nums[i%n];
            while(!stk.isEmpty() && nums[stk.peek()]<curr)
            {
                int idx=stk.pop();
                arr[idx]=curr;
            }
                
            if(i<n)
            {
                stk.push(i);
            }

            }
             return arr;

        }
       
    }
    
