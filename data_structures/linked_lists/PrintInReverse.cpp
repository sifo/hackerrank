// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem

/*
  Print elements of a linked list in reverse order as standard output
  head pointer could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
void ReversePrint(Node *head)
{
    string r = "";
    while(head != NULL) {
        r = to_string(head->data) + "\n" + r;
        head = head->next; 
    }
    cout << r;
}
