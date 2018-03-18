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

node * insertRec(node * root, int value) {
    node * i =  new node({value, NULL, NULL});
    if(root == NULL) {
        return i;
    }
    if(value > root->data) {
        if(root->right == NULL) {
            root->right = i;
        }
        else insert(root->right, value);
    } else {
        if(root->left == NULL) {
            root->left = i;
        }
        else insert(root->left, value);
    }
    return root;
}

node * insertRec2(node * root, int value) {
    node * i =  new node({value, NULL, NULL});
    if(root == NULL) {
        return i;
    }
    if(value > root->data) {
        root->right = insert(root->right, value);
    } else {
        root->left = insert(root->left, value);
    }
    return root;
}
