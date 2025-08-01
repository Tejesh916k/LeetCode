class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        f=0
        l=len(numbers)-1
        while(f<l):
            res=numbers[f]+numbers[l]
            if(res==target):
                return [f+1,l+1]
            elif(res>target):
                l-=1
            else:
                f+=1
        return [0,0]


        