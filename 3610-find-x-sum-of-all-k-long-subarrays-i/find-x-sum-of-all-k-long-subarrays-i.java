class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        HashMap<Integer,Integer>map = new HashMap<>();
        
        
        int left=0;
        int right=0;
        int len=nums.length;
        int res[]=new int[len-k+1];
        while(right<len){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1==k){
               PriorityQueue<Map.Entry<Integer, Integer>> pq =
                    new PriorityQueue<>((a, b) -> {
                        if (!a.getValue().equals(b.getValue()))
                            return b.getValue() - a.getValue();
                        else
                            return b.getKey() - a.getKey();
                    });
        pq.addAll(map.entrySet());
        int sum=0;
        int count=0;
        while(!pq.isEmpty() && count < x){
            Map.Entry<Integer,Integer> top = pq.poll();
            sum+=top.getKey()*top.getValue();
            count++;
        }
        map.put(nums[left],map.get(nums[left])-1);
        if(map.get(nums[left])==0)
        map.remove(nums[left]);
        res[left++]=sum;


            }
            right++;



        }
        return res;

    }
}