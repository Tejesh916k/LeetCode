class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        list_1=[]
        if not nums:
            return []
        l=nums[0]
        for i in range(1,len(nums)+1):
            if(i==len(nums) or nums[i]!=nums[i-1]+1  ):
                if(l==nums[i-1]):
                    list_1.append(str(l))
                else:
                    list_1.append(f"{l}->{nums[i-1]}")
                if(i<len(nums)):
                    l=nums[i]
            
        return list_1  

            

                
