class Solution:
    def minOperations(self, grid: List[List[int]], x: int) -> int:
        list_1 = sorted(i for row in grid for i in row)
        n = len(list_1)
        median = list_1[n // 2]  # Use only one median value, no need for two candidates

        def diff(target, list_1):
            total_moves = 0
            for num in list_1:
                diff = abs(target - num)
                if diff % x != 0:
                    return -1
                total_moves += diff // x
            return total_moves

        return diff(median, list_1)

