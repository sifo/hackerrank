// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* InsertNth(Node *head, int data, int position)
{
    Node *n = new Node();
    n->data = data;
    if(position == 0) {
        n->next = head;
        return n;
    }
    else {
        Node *cur = head;
        while(position > 1 && cur->next != NULL) {
            cur = cur->next;
            position--;
        }
        n->next = cur->next;
        cur->next = n;
        return head;
    }
}
