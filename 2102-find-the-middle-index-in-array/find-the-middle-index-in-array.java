class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftsum[] = new int[n];
        int rightsum[] = new int[n];
        leftsum[0]=0;
        rightsum[n-1]=0;
        for(int i=1;i<n;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
            rightsum[n-i-1]=rightsum[n-i]+nums[n-i];
        }
        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i])
            return i;
        }
        return -1;
    }
}