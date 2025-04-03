class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        left=[0]*len(nums)
        right=[0]*len(nums)
        left[0]=nums[0]
        right[-1]=nums[-1]
        max_value=0
        j=-2
        for i in range(1,len(nums)-1):
            left[i]=max(nums[i],left[i-1])
            right[j]=max(nums[j],right[j+1])
            j-=1

        for i in range(1,len(nums)-1):
            max_value=max(max_value,(left[i-1]-nums[i])*right[i+1])
        return max_value
