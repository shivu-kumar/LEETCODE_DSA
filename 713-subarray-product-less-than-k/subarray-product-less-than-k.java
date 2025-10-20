class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int product=1;
        int left=0;
        int right=0;
        while(right<nums.length){
            product*=nums[right];
            while(product>=k && left<=right){
                product/=nums[left];
                left++;
            }
            count=count+((right-left)+1);
            right++;
        }
        return count;
    }
}