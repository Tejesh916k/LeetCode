class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stk=[]
        for i in num:
            while stk and stk[-1]>i and k>0:
                stk.pop()
                k-=1
            stk.append(i)
        stk=stk[:len(stk)-k]
        res="".join(stk).lstrip('0')
        return res or "0"
        