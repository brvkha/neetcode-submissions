class Solution {
    public boolean isValid(String s) {
        // Biến chuỗi thành mảng char để truy xuất siêu tốc
        char[] chars = s.toCharArray();
        
        // Mảng này đóng vai trò như một cái Stack
        char[] stack = new char[chars.length]; 
        
        // top là chỉ mục (index) trỏ đến phần tử trên cùng của stack.
        // top = -1 nghĩa là stack đang trống.
        int top = -1; 
        
        for (char c : chars) {
            // Nếu là dấu mở -> Đẩy vào stack (Tăng top lên)
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } 
            // Nếu là dấu đóng
            else {
                // Stack trống (chưa có mở mà đòi đóng)
                if (top == -1) return false; 
                
                // Lấy ký tự trên cùng của stack ra so sánh
                char lastOpen = stack[top]; 
                
                if (c == ')' && lastOpen != '(') return false;
                if (c == ']' && lastOpen != '[') return false;
                if (c == '}' && lastOpen != '{') return false;
                
                // Trùng khớp thì "xóa" khỏi stack bằng cách giảm top xuống 1
                top--; 
            }
        }
        
        // Nếu stack rỗng (đóng mở đủ cặp) thì top sẽ quay về -1
        return top == -1; 
    }
}