class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int n=nums.length;
        int total=(n*(n+1))/2;
        for(int num:nums){
            if(map.containsKey(num))
            res[0]=num;
            else{
            map.put(num,map.getOrDefault(num,0)+1);
            sum=sum+num;
            }
        }
        res[1]=total-sum;
        return res;
    }
}