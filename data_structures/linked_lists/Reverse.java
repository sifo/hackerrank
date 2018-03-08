// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

Node Reverse(Node head) {
    if(head == null)
        return null;
    if(head.next == null)
        return head;
    ArrayList<Node> l = new ArrayList<Node>();
    Node cur = head;
    while(cur != null) {
        l.add(cur);
        cur = cur.next;
    }
    for(int i = l.size()-1; i > 0; i--) {
        l.get(i).next = l.get(i-1);
    }
    l.get(0).next = null;
    return l.get(l.size()-1);
}

Node RecursiveReverse(Node head) {
    if(head == null)
        return null;
    if(head.next == null)
        return head;
    Node tmp = head.next;
    head.next = null;
    Node res = Reverse(tmp);
    tmp.next = head;
    return res;
}
