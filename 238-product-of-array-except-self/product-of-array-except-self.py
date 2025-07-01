class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        multi=1
        list_1=[]
        ind=0
        for i in nums:
            if(i!=0):
                multi=multi*i
            if(i==0):
                ind+=1
        if(ind==1):
            for i in nums:
                if(i==0):
                    list_1.append(multi)
                else:
                    list_1.append(0)
        elif(ind>1):
            for i in nums:
                list_1.append(0)
        else:
            for i in nums:
                list_1.append(multi//i)
        return list_1
        