Node Insert(Node head, int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    if(head != null) {
        Node cur = head;
        while(true) {
            if(cur.next == null) {
                cur.next = new Node();
                cur.next.data = data;
                break;
            } else {
                cur = cur.next;
            }
        }
    } else {
        head = new Node();
        head.data = data;
    }
    return head;
}
