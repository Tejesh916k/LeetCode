class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        de_que=collections.deque()
        list_1=[]
        l=0
        r=0
        while r < len(nums):
            while de_que and nums[de_que[-1]] < nums[r]:
                de_que.pop()
            de_que.append(r)
            if l > de_que[0]:
                de_que.popleft()
            if r+1 >= k:
                list_1.append(nums[de_que[0]])
                l+=1
            r+=1
        return list_1
