class Solution {
    public boolean isAnagram(String s, String t) {
        return convertStringToList(s).equals(convertStringToList(t));
    }

    public List<Character> convertStringToList(String s){
        List<Character> l = new LinkedList<>();
        for ( char c : s.toCharArray()){
            l.add(c);
        }
        return l.stream().sorted().toList();
    }
}
