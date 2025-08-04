class Solution:
    def canJump(self, nums: List[int]) -> bool:
        a=0
        for i in range(0,len(nums)):
            if(a<i):
                return False
            a=max(i+nums[i],a)
        return True
