#include <iostream>
using namespace std;

int main() {
  string s;
  getline(cin, s);
  int alphabet[26] = { 0 };
  for(int i = 0; i < s.size(); i++) {
    if(s[i] >= 'a' && s[i] <= 'z') {
      int j = s[i]-'a';
      alphabet[j]++;
    } else if(s[i] >= 'A' && s[i] <= 'Z') {
      int j = s[i]-'A';
      alphabet[j]++;
    }
  }
  bool pangram = true;
  for(int i = 0; i < 26; i++) {
    if(alphabet[i] == 0) {
      pangram = false;
      break;
    }
  }
  if(!pangram) {
    cout << "not pangram" << endl;
  } else {
    cout << "pangram" << endl;
  }
}
