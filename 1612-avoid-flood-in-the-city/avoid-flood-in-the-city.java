class Solution {
    public int[] avoidFlood(int[] rains) {
        int n=rains.length;
        int ans[]=new int[n];
        Arrays.fill(ans,1);
        HashMap<Integer,Integer>map=new HashMap<>();
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<rains.length;i++){
            if(rains[i]==0)
            {
                set.add(i);
            }else{
                int lake=rains[i];
                ans[i]=-1;
            if(map.containsKey(rains[i])){
                Integer dryDay=set.ceiling(map.get(rains[i]));
                if(dryDay==null)
                return new int[0];

                ans[dryDay]=lake;
                set.remove(dryDay);
               
            }
            map.put(lake,i);
        }
        }
        return ans;
    }
}