// https://www.hackerrank.com/challenges/is-binary-search-tree/problem

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node struct is defined as follows:
   struct Node {
      int data;
      Node* left;
      Node* right;
   }
*/
bool checkBST(Node* root) {
    if(root == NULL)
        return true;
    if(smaller(root->left, root->data) && bigger(root->right, root->data))
        return checkBST(root->left) && checkBST(root->right);
    return false;
}

bool smaller(Node* root, int data) {
    if(root == NULL)
        return true;
    if(root->data >= data)
        return false;
    return smaller(root->right, data) && smaller(root->left, data);
}

bool bigger(Node* root, int data) {
    if(root == NULL)
        return true;
    if(root->data <= data)
        return false;
    return bigger(root->right, data) && bigger(root->left, data);
}
