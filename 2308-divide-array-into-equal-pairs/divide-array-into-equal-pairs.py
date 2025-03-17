class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        a=0
        list_1=[]
        for i in nums:
            n=nums.count(i)
            if(n%2!=0):
                return False
        return True
        

        