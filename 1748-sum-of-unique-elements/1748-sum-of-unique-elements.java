class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }
}