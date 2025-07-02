class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if s == t:
            return s
        if (t == ""):
            return ""
        dict_1={}
        for i in t:
            dict_1[i]=dict_1.get(i,0)+1
        have=0
        need=len(dict_1)
        dict_2={}
        resStr,reslen="",float('inf')
        l=0
        for r in range(len(s)):
            dict_2[s[r]]=dict_2.get(s[r],0)+1
            if s[r] in dict_1 and dict_1[s[r]]==dict_2[s[r]]:
                have+=1
            while have==need:
                if(r-l+1<reslen):
                    reslen=r-l+1
                    resStr=s[l:r+1]
                dict_2[s[l]]-=1
                if s[l] in dict_1 and dict_2[s[l]]<dict_1[s[l]]:
                    have-=1
                l+=1
        return resStr
        