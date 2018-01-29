// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  int t[n] = {0};
  for(int i = 0; i < n; i++) {
    cin >> t[i];
  }
  int h = t[0], l = t[0], hc = 0, lc = 0;

  for(int i = 1; i < n; i++) {
    if(t[i] > h) {
      h = t[i];
      hc++;
    }
    if(t[i] < l) {
      l = t[i];
      lc++;
    }
  }
  cout << hc <<  " " << lc << endl;
}
