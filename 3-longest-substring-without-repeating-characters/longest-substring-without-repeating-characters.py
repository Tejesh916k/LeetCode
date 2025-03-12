class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=0
        set_1=set()
        length=0
        for i in range(len(s)):
            while s[i] in set_1:
                set_1.remove(s[l])
                l+=1
            set_1.add(s[i])
            length=max(length,i-l+1)
        return length
        