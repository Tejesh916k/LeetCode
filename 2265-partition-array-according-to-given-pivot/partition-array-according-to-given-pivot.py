class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        list_1=[]
        for i in nums:
            if i<pivot:
                list_1.append(i)
        for i in nums:
            if i == pivot:
                list_1.append(i)
        for i in nums:
            if i>pivot:
                list_1.append(i)
        print(list_1)
        return list_1

        