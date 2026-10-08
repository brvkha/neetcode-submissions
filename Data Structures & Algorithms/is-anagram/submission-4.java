class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for ( char c : s.toCharArray()){
            if (map1.containsKey(c)){
                map1.replace(c,map1.get(c)+1);
            }else {
                map1.put(c,0);
            }
        }
        for ( char c : t.toCharArray()){
            if (map2.containsKey(c)){
                map2.replace(c,map2.get(c)+1);
            }else {
                map2.put(c,0);
            }
        }
        if (map1.equals(map2)){
            return true;
        }else {
            return false;
        }


    }
}
