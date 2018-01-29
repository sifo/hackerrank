// https://www.hackerrank.com/challenges/reduced-string/problem

#include <iostream>
using namespace std;

int main() {
  string s;
  cin >> s;

  string r;
  bool reduced = true;
  while(reduced) {
    reduced = false;
    r = "";
    for(int i = 0; i < s.size(); i++) {
      if((i+1) < s.size() && s[i] == s[i+1]) {
        i++;
        reduced = true;
      } else {
        r += s[i];
      }
    }
    s = r;
  }
  if(r == "") {
    cout << "Empty String" << endl;
  } else {
    cout << r << endl;
  }
}
