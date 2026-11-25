class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length, mx = 0;
        for (int i = 0; i < n; i++) {
            nums[i] += 50000;
            mx = Math.max(nums[i], mx);
        }
        int[] out = new int[n];
        for (int a = 1; a < mx + 1; a *= 10) {
            int[] start = new int[11];
            for (int i = 0; i < n; i++) {
                start[(nums[i] / a) % 10 + 1]++;
            }
            for (int d = 0; d < 10; d++) {
                start[d + 1] += start[d];
            }
            for (int i = 0; i < n; i++) {
                out[start[(nums[i] / a) % 10]++] = nums[i];
            }
            int[] tmp = nums;
            nums = out;
            out = tmp;
        }
        for (int i = 0; i < n; i++) {
            nums[i] -= 50000;
        }
        return nums;
    }
}