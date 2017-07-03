#include <cmath>
#include <iostream>
using namespace std;

/*

  we have :

  0 + 3 * 4 = 12
  4 + 2 * 4 = 12

  which mean we have the system of linears equations:

  x1 + v1 * x = y
  x2 + v2 * x = y

  which gives :

  x1 + v1 * x = y
  (x2 - x1) / (v1 - v2) = x

  if x is a natural number then the two kangaroo meet in x steps.

*/

int main() {
  int x1, x2, v1, v2;
  cin >> x1;
  cin >> v1;
  cin >> x2;
  cin >> v2;
  if((x1 == x2 && v1 != v2) || (x1 != x2 && v1 == v2) ||
     (x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2)) {
    cout << "NO" << endl;
  } else if(x1 == x2 && v1 == v2) {
    cout << "YES" << endl;
  } else {
    float x = (x2-x1)/(float)(v1-v2);
    if(floor(x) == x) {
      cout << "YES" << endl;
    } else {
      cout << "NO" << endl;
    }
  }
}
