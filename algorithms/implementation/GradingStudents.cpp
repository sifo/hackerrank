#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;
  int t[n];
  for(int i = 0; i < n; i++) {
    cin >> t[i];
  }
  for(int i = 0; i < n; i++) {
    int r = t[i] + 1;
    int r2 = t[i] + 2;
    if(r%5 == 0 && r%10 != 0 && r >= 40) {
      cout << r << endl;
    } else if(r2%5 == 0 && r2%10 != 0 && r2 >= 40) {
      cout << r2 << endl;
    } else if(r%10 == 0 && r >= 40) {
      cout << r << endl;
    } else if(r2%10 == 0 && r2 >= 40) {
      cout << r2 << endl;
    } else {
      cout << t[i] << endl;
    }
  }
}
