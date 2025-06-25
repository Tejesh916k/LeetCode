class Solution:
    def decodeString(self, s: str) -> str:
        stk=[]
        for i in range(len(s)):
            if s[i] != ']':
                stk.append(s[i])
            else:
                string=""
                while stk[-1]!='[':
                    string=stk.pop()+string
                stk.pop()

                k=""
                while stk and stk[-1].isdigit():
                    k=stk.pop()+k
                stk.append(int(k)*string)

        return "".join(stk)
        