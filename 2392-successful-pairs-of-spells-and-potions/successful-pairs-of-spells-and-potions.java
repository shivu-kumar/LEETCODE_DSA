class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int pairs[]=new int[n];
        for(int i=0;i<n;i++){
            int c=search(spells[i],potions,success,0,m-1);
            pairs[i]=m-c;
        }
        return pairs;

       }
       static int search(int spell,int []potions,long success,int left,int right){
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long)spell*(long)potions[mid]>=success){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;

       }
}