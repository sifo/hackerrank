// https://www.hackerrank.com/challenges/tree-inorder-traversal/problem

/* you only have to complete the function given below.
Node is defined as

struct node
{
    int data;
    node* left;
    node* right;
};

*/

void inOrder(node *root) {
    if(root == NULL)
        return;
    inOrder(root->left);
    cout << root->data << " ";
    inOrder(root->right);
}

////////////////////////

bool compareNode(node * x, node * y) {
    return x->data < y->data;
}

void inOrder(node *root) {
    if(root == NULL)
        return;
    vector<node*> values;
    list<node*> queue;
    queue.push_back(root);
    while(!queue.empty()) {
        node * f = queue.front();
        queue.pop_front();
        values.push_back(f);
        if(f->right != NULL)
            queue.push_back(f->right);
        if(f->left != NULL)
            queue.push_back(f->left);
    }
    std::sort(values.begin(), values.end(), compareNode);
    for(auto i: values) {
        cout << i->data << " ";
    }
}
