// https://www.hackerrank.com/challenges/staircase/problem

#include <iostream>
#include <cstdio>
using namespace std;

int main() {
  int n;
  cin >> n;
  for(int i = 0; i < n; i++) {
    for(int j = n-i-2; j >= 0; j--) {
      cout << " ";
    }
    for(int k = 0; k < i+1; k++) {
      cout << "#";
    }
    cout << endl;
  }
  return 0;
}
