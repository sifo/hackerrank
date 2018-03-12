// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

int FindMergeNode(Node headA, Node headB) {
    Node a = headA;
    Node b = headB;
    while(a != null) {
        while(b != null) {
            if(a.next == b.next)
                return a.next.data;
            b = b.next;
        }
        b = headB;
        a = a.next;
    }
    return 0;
}
