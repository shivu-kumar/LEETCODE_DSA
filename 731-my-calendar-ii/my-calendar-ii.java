class MyCalendarTwo {
    List<int[]>overlap = new ArrayList<>();
    List<int[]>booked = new ArrayList<>();

    public MyCalendarTwo() {
        
    }
    
    public boolean book(int start, int end) {
        for(int[]o:overlap){
            if(start<o[1] && end>o[0])
            return false;
        }
        for(int[]b:booked){

            if(start<b[1] && end>b[0]){
                overlap.add(new int[]{Math.max(start,b[0]),Math.min(end,b[1])});
            }
        }
        booked.add(new int[]{start,end});
        
    return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */