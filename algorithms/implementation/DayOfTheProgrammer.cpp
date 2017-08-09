#include <iostream>
#include <cstdio>
using namespace std;

// version with adjustable day D.
int main() {
  int D = 256;
  int y;
  int t[]= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  int l[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  int s[] = { 31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  cin >> y;
  int * c;
  if(y > 1918) {
    if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
      c = l;
    } else {
      c = t;
    }
  } else if(y < 1918) {
    if(y % 4 == 0) {
      c = l;
    } else {
      c = t;
    }
  } else {
    c = s;
  }
  int days = 0;
  int i = 0;
  for(; i < 12 && days < D; i++) {
    days += c[i];
  }
  days -= c[i];
  printf("%02d.%02d.%d\n", D-days-1, i, y);
}

/*

int main() {
  int y;
  cin >> y;
  if(y > 1918) {
    if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
      cout << "12.09." << y << endl;
    } else {
      cout << "13.09." << y << endl;
    }
  } else if(y == 1918) {
    cout << "26.09." << y << endl;
  } else {
    if(y % 4 == 0) {
      cout << "12.09." << y << endl;
    } else {
      cout << "13.09." << y << endl;
    }
  }
}
*/
