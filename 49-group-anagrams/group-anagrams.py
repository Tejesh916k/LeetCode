class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        set_1=set()
        list_1=[]
        for i in strs:
            s="".join(sorted(i))
            set_1.add(s)
        list_1=list(set_1)
        list_3=[[] for _ in list_1]
        for i in strs:
            s="".join(sorted(i))
            ind=list_1.index(s)
            list_3[ind].append(i)                    
        return list_3
        