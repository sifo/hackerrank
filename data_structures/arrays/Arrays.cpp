// https://www.hackerrank.com/challenges/arrays-ds/problem

#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  int t[n];
  for(int i = 0; i < n; i++) {
    cin >> t[i];
  }
  for(int i = n-1; i >= 0; i--) {
    cout << t[i] << " ";
  }
  cout << endl;
}
