/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(head == null)
        return null;
    if(position == 0)
        return head.next;

    Node c = head;
    while(c != null && position-- > 1) {
        c = c.next;
    }
    if(c.next != null)
        c.next = c.next.next;
    return head;
}
