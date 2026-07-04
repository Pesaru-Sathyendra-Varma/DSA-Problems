class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=0;
        int sum2=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }
        return sum2-sum1;
    }
}