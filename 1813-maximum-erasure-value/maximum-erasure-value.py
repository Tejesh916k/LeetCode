class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        set_1=set()
        curr=0
        maxi=0
        j=0
        for i in range(len(nums)):
            while(nums[i] in set_1):
                set_1.remove(nums[j])
                curr-=nums[j]
                j+=1
            
            set_1.add(nums[i])
            curr+=nums[i]
            maxi=max(maxi,curr)
        return maxi