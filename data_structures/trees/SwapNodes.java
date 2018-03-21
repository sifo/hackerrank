// https://www.hackerrank.com/challenges/swap-nodes-algo/problem

import java.util.Scanner;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class SwapNodes {

    public static Node swap(Node root, int depth) {
        if(root == null)
            return root;
        if(depth < 1)
            return root;
        else if(depth == 1) {
            Node tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        } else {
            root.right = swap(root.right, depth-1);
            root.left = swap(root.left, depth-1);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data, null, null);
        } else {
            Node cur;
            if(data > root.data) {
                cur = insert(root.right, data);
                root.right = cur;
            } else {
                cur = insert(root.left, data);
                root.left = cur;
            }
        }
        return root;
    }

    public static int height(Node root) {
        int l = 0;
        int r = 0;
        if(root.left != null)
            l = 1 + height(root.left);
        if(root.right != null)
            r = 1 + height(root.right);
        return l > r ? l : r;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Node> queue = new LinkedList<Node>();
        Node root = new Node(1, null, null);
        queue.add(root);
        while(n-- > 0) {
            Node cur = queue.poll();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a != -1) {
                cur.left = new Node(a, null, null);
                queue.add(cur.left);
            }
            if(b != -1) {
                cur.right = new Node(b, null, null);
                queue.add(cur.right);
            }
        }
        int p = sc.nextInt();
        while(p-- > 0) {
            int a = sc.nextInt();
            int h = height(root);
            for(int i = 1; i*a <= h; i++) {
                root = swap(root, i*a);
            }
            inOrder(root);
            System.out.println();
        }
    }
}
