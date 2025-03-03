class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        imp_list=["+","-","*","/"]
        stack=[]
        for i in tokens:
            if i not in imp_list:
                num=int(i)
                stack.append(num)
            if i in imp_list:
                if i == "+":
                    ans=stack[-2]+stack[-1]
                    stack.pop()
                    stack[-1]=ans
                if i == "-":
                    ans=stack[-2]-stack[-1]
                    stack.pop()
                    stack[-1]=ans
                if i == "*":
                    ans=stack[-2]*stack[-1]
                    stack.pop()
                    stack[-1]=ans
                if i == "/":
                    ans=int(stack[-2]/stack[-1])
                    stack.pop()
                    stack[-1]=ans
        return stack[-1]  

        