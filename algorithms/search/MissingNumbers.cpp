/*
  https://www.hackerrank.com/challenges/missing-numbers/problem

  Could be done with 1 array, if we decrement for A and increment for B, and
  check which indexes are greater than 0.
*/

#include <iostream>
using namespace std;

int main() {
    int S = 2*100000;
    int n, m, x;
    cin >> n;
    int t[S] = { 0 };
    for(int i = 0; i < n; i++) {
        cin >> x;
        t[x]++;
    }
    cin >> m;
    int p[S] = { 0 };
    for(int i = 0; i < m; i++) {
        cin >> x;
        p[x]++;
    }
    for(int i = 0; i < S; i++) {
        if(t[i] != p[i]) {
            cout << i << " ";
        }
    }
    cout << endl;
}
