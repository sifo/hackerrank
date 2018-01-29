// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

#include <iostream>
using namespace std;

int main() {
  int n, k, res = 0;
  cin >> n >> k;
  int t[n] = {0};
  for(int i = 0; i < n; i++) {
    cin >> t[i];
  }
  for(int i = 0; i < n; i++) {
    for(int j = i+1; j < n; j++) {
      if((t[i] + t[j]) % k == 0) {
        res++;
      }
    }
  }
  cout << res << endl;
}
