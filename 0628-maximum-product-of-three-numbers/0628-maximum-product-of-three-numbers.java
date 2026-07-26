class Solution {
    public int maximumProduct(int[] nums) {
         int n=nums.length;
        int product1=1;
        Arrays.sort(nums);
        int n1=nums[n-1];
        int n2=nums[n-2];
        int n3=nums[n-3];
        product1=n1*n2*n3;
        int product2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(product1, product2);
    }
}