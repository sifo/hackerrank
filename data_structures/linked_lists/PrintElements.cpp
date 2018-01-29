// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
// method only submission

void Print(Node *head) {
  if(head != NULL) {
    cout << head->data << endl;
    Print(head->next);
  }
}
