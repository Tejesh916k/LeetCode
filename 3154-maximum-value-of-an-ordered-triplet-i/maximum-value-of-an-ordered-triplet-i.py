class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        n = len(nums)
        max_value = 0

        # Iterate over j (middle index)
        for j in range(1, n - 1):
            # Find the best nums[i] before j
            best_i = max(nums[:j])
            
            # Find the best nums[k] after j
            best_k = max(nums[j+1:])
            
            # Compute the triplet value
            triplet_value = (best_i - nums[j]) * best_k
            max_value = max(max_value, triplet_value)
        
        return max_value



            
            



