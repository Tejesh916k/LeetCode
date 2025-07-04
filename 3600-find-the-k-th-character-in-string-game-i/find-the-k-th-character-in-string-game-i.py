class Solution:
    def kthCharacter(self, k: int) -> str:
        str_1=[0]
        while(len(str_1)<k):
            for i in range(len(str_1)):
                str_1.append((str_1[i]+1)%26)
        
        print(str_1)
        return chr(str_1[k-1]+ord('a'))