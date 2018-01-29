// https://www.hackerrank.com/challenges/sparse-arrays/problem

#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
  int N = 0;
  int Q = 0;
  cin >> N;
  vector<string> s;
  vector<string> q;

  for(int i = 0; i < N; i++) {
    string tmp;
    cin >> tmp;
    s.push_back(tmp);
  }
  cin >> Q;
  int res[Q] = {0};
  for(int i = 0; i < Q; i++) {
    string tmp;
    cin >> tmp;
    q.push_back(tmp);
  }

  for(int i = 0; i < N; i++) {
    for(int j = 0; j < Q; j++) {
      if(s[i] == q[j]) {
        res[j]++;
      }
    }
  }
  for(int i = 0; i < Q; i++) {
    cout << res[i] << endl;
  }
  return 0;
}
