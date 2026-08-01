class Solution {
    public int searchInsert(int[] nums, int target) {
      int n=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                return i;
            }
        }
        if(n< target) {
            return nums.length;
        }
        return -1;  
    }
}