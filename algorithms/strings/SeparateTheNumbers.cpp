// https://www.hackerrank.com/challenges/separate-the-numbers/problem

#include <iostream>
#include <sstream>
#include <cmath>
using namespace std;

unsigned digits(unsigned i) {
    return i > 0 ? (int) log10 ((double) i) + 1 : 1;
}

int main() {
  int q;
  cin >> q;
  cin.ignore();
  stringstream ss;
  for(int i = 0; i < q; i++) {
    string s;
    getline(cin, s);
    if(s.length() == 1 || s[0] == '0') {
      ss << "NO" << endl;
      continue;
    }
    int l = s.size()/2+1;
    bool flag = true;
    for(int j = 1; j < l; j++) {
      flag = true;
      int begin = 0;
      int length = j;
      if(begin+length >= (signed)s.size()) {
          flag = false;
          break;
      }
      long long f = stol(s.substr(begin, length));
      long long res = f;


      begin = length;
      if(digits(f+1) == digits(f)+1) {
        length++;
      }
      bool allchar = false;
      while(begin+length < (signed) s.size()+1) {
        long long next = stol(s.substr(begin, length));
        if(next == f+1) {
          if(begin+length == (signed) s.size())
            allchar = true;
          begin += length;
          if(digits(next+1) == digits(next)+1) {
            length++;
          }
          f = next;
        } else {
          flag = false;
          break;
        }
      }
      if(flag && allchar) {
        ss << "YES " << res << endl;
        break;
      }
    }
    if(!flag) {
      ss << "NO" << endl;
    }
  }
  cout << ss.str();
}
