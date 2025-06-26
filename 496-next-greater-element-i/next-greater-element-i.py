class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res=[]
        for i in nums1:
            ind=nums2.index(i)
            list_1=nums2[ind+1:]
            pos=-1
            for j in list_1:
                if j>i:
                    pos=j
                    break
            res.append(pos)
        return res
        