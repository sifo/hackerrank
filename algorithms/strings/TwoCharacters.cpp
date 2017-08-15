#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  char t[n] = {'0'};
  for(int i = 0; i < n; i++) {
    cin >> t[i];
  }
  int max = 0;
  for(int i = 0; i < n-1; i++) {
    for(int j = i+1; j < n; j++) {
      if(t[i] != t[j]) {
        int c = 0;
        char previous = '0';
        for(int k = 0; k < n; k++) {
          if(t[k] == t[i] || t[k] == t[j]) {
            if(t[k] == previous) {
              c = 0;
              break;
            }
            previous = t[k];
            c++;
          }
        }
        if(c > max) {
          max = c;
        }
      }
    }
  }
  cout << max << endl;
}
