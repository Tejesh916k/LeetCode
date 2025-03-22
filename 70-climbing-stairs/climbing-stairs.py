class Solution:
    def climbStairs(self, n: int) -> int:
        if n<=3:
            return n
        a=2
        b=3
        sum_1=0
        for i in range(3,n):
            sum_1=a+b
            a=b
            b=sum_1
        return sum_1