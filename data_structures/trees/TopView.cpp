// https://www.hackerrank.com/challenges/tree-top-view/problem

/*
struct node
{
    int data;
    node* left;
    node* right;
};

*/

void topViewLeft(node * root) {
    if(root == NULL)
        return;
    topViewLeft(root->left);
    cout << root->data << " ";
}

void topView(node * root) {
    if(root == NULL)
        return;
    topViewLeft(root->left);
    node * r = root;
    while(r != NULL) {
        cout << r->data << " ";
        r = r->right;
    }
}
