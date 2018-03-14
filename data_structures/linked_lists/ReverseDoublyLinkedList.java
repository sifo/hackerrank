// https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem

/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    Node t = head;
    Node last = head;
    while(t != null) {
        Node tmp = t.next;
        t.next = t.prev;
        t.prev = tmp;
        if(t.next != null)
            last = t;
        t = tmp ;
    }
    return last;
}
