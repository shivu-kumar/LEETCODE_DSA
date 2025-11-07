class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>Map1=new HashMap<>();
        HashMap<Character,Integer>Map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            Map1.put(s1.charAt(i),Map1.getOrDefault(s1.charAt(i),0)+1);
        }
        int len1=s1.length();
        int len=s2.length();
        int left=0;
        int right=0;
        int similar=0;
        while(right<len){
             Map2.put(s2.charAt(right),Map2.getOrDefault(s2.charAt(right),0)+1);
             
             if(right-left+1==len1){
                if(Map1.equals(Map2))
                return true;

                Map2.put(s2.charAt(left),Map2.get(s2.charAt(left))-1);

                if(Map2.get(s2.charAt(left))==0)
                Map2.remove(s2.charAt(left));

                left++;
             }
             right++;

        }
        return false;
    }
}