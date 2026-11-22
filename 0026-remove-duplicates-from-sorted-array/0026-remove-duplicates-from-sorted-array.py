class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        i,j=0,1
        while i<len(nums) and j<len(nums):
            if nums[i]==nums[j]:
                j+=1
            else:
                i+=1
                nums[i]=nums[j]
        return i+1
        