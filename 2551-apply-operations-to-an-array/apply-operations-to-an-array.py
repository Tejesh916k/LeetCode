class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)-1):
            if (nums[i]==nums[i+1]):
                nums[i]*=2
                nums[i+1]=0
        n=len(nums)
        list_1=[]
        c=0
        for i in nums:
            if i is not 0:
                list_1.append(i)
                c+=1
        for i in range(len(nums)-c):
            list_1.append(0)
        return list_1
        