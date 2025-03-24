class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        meetings.sort()
        sum_1=0
        max_value=max(meetings, key=lambda x:x[1])
        last=max_value[1]-meetings[0][0]+1
        last=days-last
        maxi=meetings[0][1]
        for i in range(0,len(meetings)-1):
            a=meetings[i+1][0]-meetings[i][1]
            if(a>0 and meetings[i+1][0]>maxi ):
                sum_1+=meetings[i+1][0]-maxi-1
            maxi=max(maxi,meetings[i+1][1])
        print(meetings)           
        return last+sum_1


        
