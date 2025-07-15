# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        q=deque()
        q.append(root)
        isreverse=False
        if not root:
            return []
        ans=[]
        while q:
            qsize=len(q)
            sub=[]
            for i in range(qsize):
                
                if not isreverse:
                    root=q.popleft()
                    sub.append(root.val)
                    if root.left!=None:
                        q.append(root.left)
                    if root.right!=None:
                        q.append(root.right)
                   
                    
                else:
                    root=q.pop()
                    sub.append(root.val)
                    if root.right!=None:
                        q.appendleft(root.right)
                    if root.left!=None:
                        q.appendleft(root.left)
                    
                    
            ans.append(sub)
            isreverse=not isreverse
        return ans
                        

        