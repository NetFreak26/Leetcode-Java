class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<> ();
        int n = nums.length;
        int ans[] = {-1, -1};

        for (int i=0; i<n; i++) {
            int second = target - nums[i];
            if (indexes.get(second) != null) {
                ans[0] = indexes.get(second);
                ans[1] = i;
                break;
            } else {
                indexes.put(nums[i], i);
            }
        }
        return ans;
    }
}
