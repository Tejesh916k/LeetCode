class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        dict_1={'a':0,'b':0,'c':0}
        l=0
        sum_1=0
        for i in range(len(s)):
            dict_1[s[i]]+=1
            while dict_1['a']>0 and dict_1['b']>0 and dict_1['c']>0:
                sum_1+=len(s)-i            
                dict_1[s[l]]-=1
                l+=1
        return sum_1
    