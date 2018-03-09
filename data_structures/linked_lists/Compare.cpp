// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
    if(headA != NULL && headB != NULL && headA->data != headB->data)
        return 0;
    if((headA == NULL && headB != NULL) || (headA != NULL && headB == NULL))
        return 0;
    if(headA == NULL && headB == NULL)
        return 1;
    return CompareLists(headA->next, headB->next);
}

int CompareListsIter(Node *headA, Node* headB)
{
    while(headA != NULL && headB != NULL) {
        if(headA->data != headB->data)
            return 0;
        headA = headA->next;
        headB = headB->next;
    }
    return headA == NULL && headB == NULL;
}
