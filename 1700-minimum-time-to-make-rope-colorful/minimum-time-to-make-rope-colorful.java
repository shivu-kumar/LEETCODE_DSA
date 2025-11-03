class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min_time=0;
        int max_time=neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1))
            {

                min_time+=Math.min(neededTime[i],max_time);
                max_time=Math.max(neededTime[i],max_time);
            }
            else{
                max_time=neededTime[i];
            }
        }
        return min_time;

    }
}