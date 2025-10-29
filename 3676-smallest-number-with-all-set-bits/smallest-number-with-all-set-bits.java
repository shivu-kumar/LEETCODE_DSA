class Solution {
    public int smallestNumber(int n) {
        int sum=0;
        int i=0;
        while(sum<n){
            sum=sum+(int)Math.pow(2,i);
            i++;

        }
        return sum;
    }
}