class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0)
        return 0;
        
        Arrays.sort(tokens);
        if(tokens[0]>power)
        return 0;
        int n = tokens.length-1;
        int score=0;
        int i=0;
        int max=0;
        while(i<=n){
            if(tokens[i]<=power)
            {
                score++;
                power-=tokens[i];
                max=Math.max(max,score);
                i++;
            }else if(score>0){
                power+=tokens[n];
                score--;
                n--;
            }else{
                break;
            }
        }
        return max;

    }
}