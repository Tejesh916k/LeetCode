class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        l_n=-1
        f_p=len(nums)
        for i in range(len(nums)):
            if nums[i] < 0:
                l_n = i
            elif nums[i] > 0:
                f_p = i
                break
        if l_n==-1 and f_p==-1:
            return 0
        f_p=len(nums)-f_p
        l_n+=1
        print(f_p)
        print(l_n)
        return max(f_p,l_n)