class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // Tìm dấu '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // Lấy độ dài
            int len = Integer.parseInt(str.substring(i, j));

            // Lấy chuỗi
            String s = str.substring(j + 1, j + 1 + len);
            result.add(s);

            // Nhảy đến vị trí tiếp theo
            i = j + 1 + len;
        }

        return result;
    }
}