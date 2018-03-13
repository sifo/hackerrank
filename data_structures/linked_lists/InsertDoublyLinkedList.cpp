// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem

/*
    Insert Node in a doubly sorted linked list
    After each insertion, the list should be sorted
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* SortedInsert(Node *head,int data)
{
    Node *a = new Node();
    a->data = data;

    if(head == NULL)
        return a;

    if(a->data < head->data) {
        head->prev = a;
        a->next = head;
        return a;
    }

    Node *t = head;
    Node *last;
    while(t != NULL) {
        if(t->data > a->data) {
            a->next = t;
            a->prev = t->prev;
            t->prev->next = a;
            t->prev = a;
            return t == head ? a : head;
        }
        if(t->next == NULL)
            last = t;
        t = t->next;
    }
    a->prev = last;
    last->next = a;

    return head;
}
