// https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem

/*
Node is defined as

typedef struct node
{
   int data;
   node * left;
   node * right;
}node;

*/

node * insert(node * root, int value) {
    node * i =  new node({value, NULL, NULL});
    if(root == NULL) {
        return i;
    }
    node * cur = root;
    while(cur != NULL) {
        if(value > cur->data) {
            if(cur->right == NULL) {
                cur->right = i;
                break;
            }
            cur = cur->right;
        } else {
            if(cur->left == NULL) {
                cur->left = i;
                break;
            }
            cur = cur->left;
        }
    }
    return root;
}
