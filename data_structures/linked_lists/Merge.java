// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
    if(headA == null)
        return headB;
    if(headB == null)
        return headA;

    Node ca = headA;
    Node cb = headB;
    while(ca != null && cb != null) {
        if(ca.data < cb.data) {
            Node tmp = ca.next;
            if(ca.next != null && ca.next.data > cb.data)
                ca.next = cb;
            if(ca.next == null)
                ca.next = cb;
            ca = tmp;
        }
        else {
            Node tmp = cb.next;
            if(cb.next != null && cb.next.data > ca.data)
                cb.next = ca;
            if(cb.next == null)
                cb.next = ca;
            cb = tmp;
        }
    }

    if(headA.data > headB.data)
        return headB;
    else
        return headA;
}
