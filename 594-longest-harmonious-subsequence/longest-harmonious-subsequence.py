class Solution:
    def findLHS(self, nums: List[int]) -> int:
        dict_1=Counter(nums)
        max_sum=0
        for i,j in dict_1.items():
            count=0
            if i+1 in dict_1:
                count=dict_1[i]+dict_1[i+1]
            max_sum=max(max_sum,count)
        return max_sum