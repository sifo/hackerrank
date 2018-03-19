// https://www.hackerrank.com/challenges/tree-huffman-decoding/problem

/*
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;

*/

void decode(String S, Node root) {
    int i = 0;
    Node c = root;
    while(i < S.length()) {
        if(S.charAt(i) == '1') {
            c = c.right;
        } else {
            c = c.left;
        }
        if(c.data != '\0') {
            System.out.print(c.data);
            c = root;
        }
        i++;
    }
}
