// https://www.hackerrank.com/challenges/dynamic-array/problem

#include <string>
#include <iterator>
#include <iostream>
#include <algorithm>
#include <array>
#include <vector>
using namespace std;

int main() {
  int N, Q;
  cin >> N;
  cin >> Q;
  vector<int> seqList[N];
  int lastAnswer = 0;
  int queries[Q][3];
  for(int i = 0; i < Q; i++) {
    cin >> queries[i][0];
    cin >> queries[i][1];
    cin >> queries[i][2];
  }

  for(int i = 0; i < Q; i++) {
    if(queries[i][0] == 1) {
      int x = queries[i][1];
      int y = queries[i][2];
      vector<int> *seq = &seqList[(x^lastAnswer)%N];
      (*seq).push_back(y);
    } else if(queries[i][0] == 2) {
      int x = queries[i][1];
      int y = queries[i][2];
      vector<int> *seq = &seqList[(x^lastAnswer)%N];
      int size = (*seq).size();
      lastAnswer = (*seq).at(y%size);
      cout << lastAnswer << endl;
    }
  }
}
