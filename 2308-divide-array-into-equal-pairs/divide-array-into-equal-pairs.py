class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        a=0
        list_1=[]
        for i in nums:
            list_1.append(nums.count(i))
        for i in list_1:
            if (i%2!=0):
                return False
        return True

        