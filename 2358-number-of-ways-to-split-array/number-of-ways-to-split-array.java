class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] leftsum = new long[n];
        long[] rightsum = new long[n];

        leftsum[0] = nums[0];
        rightsum[n-1] = nums[n-1];

        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i-1] + nums[i];
        }

        for (int i = n-2; i >= 0; i--) {
            rightsum[i] = rightsum[i+1] + nums[i];
        }

        int count = 0;

        for (int i = 0; i < n-1; i++) {
            if (leftsum[i] >= rightsum[i+1]) count++;
        }

        return count;
    }
}
