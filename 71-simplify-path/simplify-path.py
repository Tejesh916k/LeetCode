class Solution:
    def simplifyPath(self, path: str) -> str:
        str_1=""
        list_2=[]
        list_1=path.split('/')
        for i in list_1:
            if i=='' or i=='.':
                continue
            if i=='..':
                if list_2:
                    list_2.pop()
            else:
                list_2.append(i)
        print("/".join(list_2))
        return "/"+"/".join(list_2)