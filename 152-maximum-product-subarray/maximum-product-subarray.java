class Solution {
    public int maxProduct(int[] nums) {
        int presum=1;
        int sufsum=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(presum==0)
            presum=1;
            if(sufsum==0)
            sufsum=1;
            presum=presum*nums[i];
            sufsum=sufsum*nums[n-i-1];
            max=Math.max(max,Math.max(presum,sufsum));

        }
        return max;
    }
}