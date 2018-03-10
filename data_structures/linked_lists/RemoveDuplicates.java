// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem

/*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    Node cur = head;
    Node tmp = null;
    while(cur != null) {
        if(tmp != null && cur.next == null) {
            tmp.next = null;
            break;
        }
        if(tmp != null && cur.next.data != tmp.data) {
            tmp.next = cur.next;
            tmp = null;
        }
        if(tmp == null && cur.next != null && cur.data == cur.next.data)
            tmp = cur;
        cur = cur.next;
    }
    return head;
}
