class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int sum=helper(numBottles,numExchange);
        return numBottles+sum;
        
    }
    static int helper(int leftOver,int numExchange){
        if (leftOver < numExchange)
            return 0;

        int newBottles = leftOver / numExchange;
        int remainder = leftOver % numExchange;

        return newBottles + helper(newBottles + remainder, numExchange);
    }
}