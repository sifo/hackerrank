#include <iostream>
using namespace std;

int main() {
  string S;
  cin >> S;
  string m = "SOS";
  int cur = 0;
  int res = 0;
  for(int i = 0; i < S.size(); i++) {
    if(m[cur] != S[i]) {
      res++;
    }
    cur = (cur + 1) % 3;
  }
  cout << res << endl;
}
