class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int left=0;
        int n=nums.length;
        while( left < n && nums[left] != 1 ){
            left++;
        }
        
        int right=left+1;
        while(right<n){
            if(right>0 && nums[right]==1){
                if(right-(left+1) < k)
                return false;
                left=right;
            }
            right++;
        }
        return true;
        
    }
}