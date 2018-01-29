// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

#include <cstdio>
#include <iostream>
using namespace std;

int blow_candles(int t[], int n) {
  if(n == 0) return 0;
  int max = 0;
  int res = 0;

  for(int i = 1; i < n; i++)
    if(t[i] > t[max])
      max = i;

  for(int i = 0; i < n; i++)
    if(t[i] == t[max]) res++;

  return res;
}

int main() {
  int n;
  cin >> n;
  int t[n];
  for(int i = 0; i < n; i++) {
    cin >> t[i];
  }
  cout << blow_candles(t, n) << endl;
  return 0;
}
