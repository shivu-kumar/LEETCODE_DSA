class Solution {
    public int findMinArrowShots(int[][] intervals) {
        if(intervals.length==1)
        return 1;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int arrows = 1;
        int curArrowX = intervals[0][1];
        for(int []cur:intervals){
            if(cur[0]>curArrowX){
                arrows++;
                curArrowX=cur[1];
            }
        }
        return arrows;
    }
}