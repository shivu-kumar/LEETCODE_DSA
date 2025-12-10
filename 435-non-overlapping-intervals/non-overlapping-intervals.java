class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int endtime = intervals[0][1];
        int count = -1;
        for(int []interval:intervals){
            if(interval[0]<endtime)
            count++;
            else{
                endtime=interval[1];
            }


        }
        return count;
    }
}