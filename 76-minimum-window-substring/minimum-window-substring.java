class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }
        int required = map1.size();
        int right = 0;
        int left = 0, minlen = Integer.MAX_VALUE, minleft = 0;
        int available = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0) + 1);

            if (map1.containsKey(c) && map1.get(c).intValue() == map2.get(c).intValue()) {
                available++;
            }
            while (left <= right && available == required) {
                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    minleft = left;
                }
                char leftchar = s.charAt(left);
                map2.put(leftchar, map2.get(leftchar) - 1);
                if (map1.containsKey(leftchar) && map2.get(leftchar).intValue() < map1.get(leftchar).intValue()) {
                    available--;
                }
                left++;
            }
            right++;
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(minleft, minleft + minlen);
    }
}