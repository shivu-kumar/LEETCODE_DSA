class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int n:nums){
            if(res.isEmpty() || res.get(res.size()-1) < n)
            res.add(n);
            else{
                int idx = binarySearch(res ,n);
                res.set(idx,n);
            }
        }
        return res.size();
    }
    static int binarySearch(List<Integer>res,int target){
        int left=0;
        int right=res.size()-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(res.get(mid)==target){
            return mid;
        }
            else if(res.get(mid)>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}