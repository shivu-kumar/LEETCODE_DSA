class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]>=1 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1])
            swap(nums,nums[i]-1,i);
        }
        int k=1;
        for(int n:nums){
            if(n!=k)
            return k;
            k++;
        }
        return nums.length+1;
    }
    static void swap(int []nums,int x,int idx){
        int temp=nums[x];
        nums[x]=nums[idx];
        nums[idx]=temp;
    }
}