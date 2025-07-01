class Solution:
    def possibleStringCount(self, word: str) -> int:
        str1=[]
        count=1
        str1.append(word[0])
        for i in range(1,len(word)):
            if(str1[-1]==word[i]):
                count+=1
            str1.append(word[i])

        return count
        
            
        