class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = fruits.length;
        int left=0;
        int right=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        while(right<n){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            count++;
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[left],map.get(fruits[left])-1);
                    count--;
                    if(map.get(fruits[left])==0)
                    map.remove(fruits[left]);
                    left++;
                }
            }
            max = Math.max(count,max);
            right++;
        }
        max = Math.max(count,max);
        return max;
    }
}