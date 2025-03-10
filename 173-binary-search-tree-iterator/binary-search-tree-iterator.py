# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class BSTIterator:
    stack=[]
    def __init__(self, root: Optional[TreeNode]):
        self.pushall(root)

    def next(self) -> int:
        temp=self.stack.pop()
        self.pushall(temp.right)
        return temp.val

    def hasNext(self) -> bool:
        if len(self.stack)>0:
            return True
        else:
            return False
    def pushall(self,root):
        while root:
            self.stack.append(root)
            root=root.left
# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()