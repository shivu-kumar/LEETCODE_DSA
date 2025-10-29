class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (right < n) {
            sum += nums[right];

            while (sum >= target) {
                int len = right - left + 1;
                if (len < min) {
                    min = len;
                }
                sum -= nums[left];
                left++;
            }

            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}