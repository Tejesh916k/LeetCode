class ProductOfNumbers:

    def __init__(self):
        self.list_1=[]
        self.prod=1

    def add(self, num: int) -> None:
        if(num==0):
            self.list_1=[]
            self.prod=1
        else:
            self.prod*=num
            self.list_1.append(self.prod)

    def getProduct(self, k: int) -> int:
        if(len(self.list_1)<k):
            return 0
        if(len(self.list_1)==k):
            return self.list_1[-1]
        return self.list_1[-1]//self.list_1[-k-1]

# Your ProductOfNumbers object will be instantiated and called as such:
# obj = ProductOfNumbers()
# obj.add(num)
# param_2 = obj.getProduct(k)