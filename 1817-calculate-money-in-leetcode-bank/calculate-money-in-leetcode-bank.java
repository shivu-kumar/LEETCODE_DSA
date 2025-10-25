class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int count=0;
        int i=1;
        int k=1;
        while(n-- > 0){
            sum+=i++;
            count++;
            if(count==7){
                count=0;
                i=k+1;
                k++;
            }
        }
        return sum;
    }
}