class Solution:
    def minimumIndex(self, nums: List[int]) -> int:
        dict_1={}
        for i in nums:
            if i not in dict_1:
                dict_1[i]=1
            else:
                dict_1[i]+=1
        key=max(dict_1,key=dict_1.get)
        value=dict_1[key]
        key_count=nums.count(key)
        if(value*2<len(nums)):
            return -1
        j=0
        for i in range(len(nums)-1):
            if(nums[i]==key):
                j+=1
            if j * 2 > (i + 1) and (key_count-j) * 2 > (len(nums) - (i + 1)):
                return i
        return -1
