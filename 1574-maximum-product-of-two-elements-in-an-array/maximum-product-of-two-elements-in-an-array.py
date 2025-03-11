class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        dup_nums=nums
        max_num=max(nums)
        dup_nums.remove(max_num)
        max_num2=max(dup_nums)
        return (max_num-1)*(max_num2-1)
        

