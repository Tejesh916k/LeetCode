class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l=0
        sum_1=0
        min_length=float(inf)
        for i in range(len(nums)):
            sum_1+=nums[i]
            while sum_1>=target:
                length=i-l+1
                min_length = min(min_length,length )
                sum_1-=nums[l]
                l+=1
        return min_length if min_length!=float(inf) else 0

            