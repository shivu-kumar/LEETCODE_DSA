class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10)
        return new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        map.put(s.substring(0,10),1);
        for(int i=1;i<s.length()-9;i++){
            String str = s.substring(i,10+i);
            if(map.containsKey(str)){
                if(!list.contains(str))
                list.add(str);

            }
            else{
                map.put(str,1);
            }
        }
        return list;

    }
}