// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem

/*
Detect a cycle in a linked list. Note that the head pointer may be 'NULL' if the list is empty.

A Node is defined as:
    struct Node {
        int data;
        struct Node* next;
    }
*/

// "The tortoise and the hare" is the solution to this problem.
bool has_cycle(Node* head) {
    int iter = 0;
    while(head != NULL && ++iter < 10000) {
        head = head->next;
    }
    return iter == 10000;
}
