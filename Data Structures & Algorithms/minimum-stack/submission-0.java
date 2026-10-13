class MinStack {
    // Tự định nghĩa cấu trúc Node
    private class Node {
        int val;
        int min;      // Lưu giá trị nhỏ nhất tại thời điểm Node này được push vào
        Node next;    // Con trỏ trỏ xuống Node bên dưới nó trong Stack

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    // Đỉnh của Stack (con trỏ duy nhất ta cần quản lý)
    private Node head;

    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        // Nếu stack rỗng, phần tử đầu tiên chính là giá trị nhỏ nhất
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            // So sánh val mới với min của head hiện tại để lấy ra số nhỏ hơn
            int currentMin = Math.min(val, head.min);
            
            // Tạo Node mới, đẩy head cũ xuống dưới (next = head)
            // và gán head mới bằng chính Node này
            head = new Node(val, currentMin, head);
        }
    }
    
    public void pop() {
        // Cắt bỏ đỉnh Stack bằng cách lùi con trỏ head xuống 1 bậc
        // Node cũ sẽ tự động bị Garbage Collector dọn dẹp (O(1))
        if (head != null) {
            head = head.next;
        }
    }
    
    public int top() {
        // Đề bài đảm bảo top() luôn gọi khi stack không rỗng
        return head.val;
    }
    
    public int getMin() {
        // Lấy giá trị min đã được lưu trữ sẵn trong Node trên cùng
        return head.min;
    }
}