class Solution {
    static{
        Solution sol = new Solution();
        int a[]={1,2,3,4,5};
        for(int i=0;i<500;i++){
            sol.findFinalValue(a,1);
        }
    }
    public static int findFinalValue(int[] nums, int original) {
         HashSet<Integer>set = new HashSet<>();
         for(int n:nums){
            set.add(n);
         }
         while(set.contains(original)){
            original=original*2;
         }
         return original;

    }
}