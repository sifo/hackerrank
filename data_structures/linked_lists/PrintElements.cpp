//method only submission
void Print(Node *head) {
  if(head != NULL) {
    cout << head->data << endl;
    Print(head->next);
  }
}
