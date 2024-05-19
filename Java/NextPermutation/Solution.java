class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        int l = i + 1;
        int r = n - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        if (i >= 0) {
            l = i + 1;
            while (nums[l] <= nums[i]) {
                l++;
            }
            int temp = nums[i];
            nums[i] = nums[l];
            nums[l] = temp;
        }
    }
}