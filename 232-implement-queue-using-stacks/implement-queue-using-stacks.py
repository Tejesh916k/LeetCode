class MyQueue:

    def __init__(self):
        self.stack=[]

    def push(self, x: int) -> None:
        self.stack.append(x)

    def pop(self) -> int:
        val= self.stack[0]
        if len(self.stack)>1:
           self.stack=self.stack[1:] 
           
        else:
            self.stack=[]
        return val

    def peek(self) -> int:
        return self.stack[0]

    def empty(self) -> bool:
        if self.stack:
            print(self.stack)
            return False

        else:
            return True
        


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()