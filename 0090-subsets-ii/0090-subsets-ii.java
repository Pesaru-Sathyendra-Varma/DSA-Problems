class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        ArrayList<Integer> curr = new ArrayList<>();
        subset(nums, 0, curr, res);
        return new ArrayList<>(res);
    }
    private void subset(int[] nums, int idx, ArrayList<Integer> curr, Set<List<Integer>> res){
        if(idx == nums.length){
            res.add(new ArrayList<Integer> (curr));
            return;
        }
        curr.add(nums[idx]);
        subset(nums, idx+1, curr, res);
        curr.remove(curr.size() - 1);
        subset(nums, idx+1, curr, res);
    }
}