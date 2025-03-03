class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        for i in tokens:
            if i == "+":
                ans=stack[-2]+stack[-1]
                stack.pop()
                stack[-1]=ans
            elif i == "-":
                ans=stack[-2]-stack[-1]
                stack.pop()
                stack[-1]=ans
            elif i == "*":
                ans=stack[-2]*stack[-1]
                stack.pop()
                stack[-1]=ans
            elif i == "/":
                ans=int(stack[-2]/stack[-1])
                stack.pop()
                stack[-1]=ans
            else:
                num=int(i)
                stack.append(num)
        return stack[-1]  

        