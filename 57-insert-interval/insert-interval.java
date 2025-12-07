class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0)
        return new int[][]{{newInterval[0],newInterval[1]}};
         //Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]>merged = new ArrayList<>();
        int flag=0;
        for(int []interval:intervals){
            if(interval[1]<newInterval[0]){
                merged.add(interval);
            }else if(interval[0]>newInterval[1]){
                if(flag==0){
                merged.add(newInterval);
                flag=1;
                }
                merged.add(interval);

            }else{
                newInterval[0]=Math.min(interval[0],newInterval[0]);
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            }
            
        }
        if(flag==0)
        merged.add(newInterval);

        return merged.toArray(new int[merged.size()][]);
    }
}