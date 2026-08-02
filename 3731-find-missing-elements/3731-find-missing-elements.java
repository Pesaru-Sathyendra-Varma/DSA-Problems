class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max =nums[i];
            }
        }
        int[] freq=new int[max+1];
        for (int i:nums) {
            freq[i]++;
        }
        for(int i=min;i<=max;i++){
            if(freq[i] ==0){
                al.add(i);
            }
        }
        return al;
    }
}