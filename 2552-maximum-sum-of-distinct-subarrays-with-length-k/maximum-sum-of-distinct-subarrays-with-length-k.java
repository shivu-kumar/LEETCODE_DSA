class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        long max=Long.MIN_VALUE;
        if(map.size()==k){
            max = Math.max(sum,max);
            }
        
        for(int i=k;i<n;i++){
            map.put(nums[i-k],map.get(nums[i-k])-1);
            if(map.get(nums[i-k])==0)
            map.remove(nums[i-k]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum=sum-nums[i-k]+nums[i];
            if(map.size()==k){
            max = Math.max(sum,max);
            }
        }
        return max<0?0:max;
    }
}