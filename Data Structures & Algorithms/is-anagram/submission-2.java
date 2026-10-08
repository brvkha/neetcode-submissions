class Solution {
    public boolean isAnagram(String s, String t) {
        return convertToList(s).equals(convertToList(t));
    }
    public List<Character> convertToList(String s) {
        List<Character> l = new LinkedList<>();
        for (char c : s.toCharArray()) {
            l.add(c);
        }
        return l.stream().sorted().toList();
    }
}
