class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        max_1=0
        max_2=0
        max_value=0
        for i in range(1,len(nums)-1):
            max_1=max(nums[0:i])
            max_2=max(nums[i+1:len(nums)])
            cur_1=(max_1-nums[i])*max_2

            max_value=max(max_value,cur_1)

        return max_value





            
            



