class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int f=nums[0];
        int e=nums[n-1];
        while(e!=0){
            int temp=e;
            e=f%e;
            f=temp;
        }
        return f;
    }
}