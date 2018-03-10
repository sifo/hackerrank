// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int GetNode(Node *head,int positionFromTail)
{
    int length = 0;
    Node *cur = head;
    while(cur != NULL) {
        length++;
        cur = cur->next;
    }
    int position = (length-1)-positionFromTail;
    cur = head;
    while(position != 0) {
        position--;
        cur = cur->next;
    }
    return cur->data;
}
