// https://www.hackerrank.com/challenges/tree-level-order-traversal/problem

/*
 class Node
    int data;
    Node left;
    Node right;
*/

void levelOrder(Node root) {
    if(root == null) {
        return;
    }
    int h = height(root);
    for(int i = 0; i <= h; i++) {
        levelOrder(root, 0, i);
    }
}

int height(Node root) {
    int l = 0;
    int r = 0;
    if(root.left != null)
        l = 1 + height(root.left);
    if(root.right != null)
        r = 1 + height(root.right);
    return l > r ? l : r;
}

void levelOrder(Node root, int cur, int depth) {
    if(root == null)
        return;
    if(cur == depth) {
        System.out.print(root.data + " ");
        return;
    }
    levelOrder(root.left, cur+1, depth);
    levelOrder(root.right, cur+1, depth);
}
