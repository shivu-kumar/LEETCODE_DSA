class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            numSub("111111");
        }
    }
    public static int numSub(String s) {
        long mod=1000000007;
        long sum=0;
        long count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            count++;
            else if(count != 0){
                sum=sum+((count*(count+1))/2)%mod;
                count=0;
            }
        }
        sum=sum+((count*(count+1))/2)%mod;
        return (int)sum;
    }
}