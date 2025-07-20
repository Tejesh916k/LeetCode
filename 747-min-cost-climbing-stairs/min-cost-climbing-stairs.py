class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        if(len(cost)==1):
            return cost[0]
        if(len(cost)==2):
            return min(cost[0],cost[1])
        prev1=0
        prev2=0
        
        for i in range(2,len(cost)+1):
            one=prev1+cost[i-1]
            two=prev2+cost[i-2]

            res=min(one,two)
            prev2=prev1
            prev1=res
        return prev1


        