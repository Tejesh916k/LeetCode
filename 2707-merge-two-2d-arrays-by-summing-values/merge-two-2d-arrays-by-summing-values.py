class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        dict_1={}
        nums3=nums1+nums2
        nums3.sort()
        for i in range(len(nums3)):
            if nums3[i][0] not in dict_1:
                dict_1[nums3[i][0]]=nums3[i][1]
            else:
                dict_1[nums3[i][0]]+=nums3[i][1]
        nums3.clear()
        for i,j in dict_1.items():
            nums3.append([i,j])
        return nums3