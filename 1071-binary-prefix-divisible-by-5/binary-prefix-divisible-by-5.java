class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>list = new ArrayList<>();
        int prefix=0;
        for(int bit:nums){
            prefix=(prefix*2+bit)%5;
            list.add(prefix==0);
        }
        return list;

    }
}