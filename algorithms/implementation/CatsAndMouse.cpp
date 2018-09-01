#include <iostream>
using namespace std;

int main() {
    int q, x, y, z, A, B;
    cin >> q;
    while(q-- > 0) {
        cin >> x >> y >> z;
        A = abs(x-z);
        B = abs(y-z);
        if(A == B) {
            cout << "Mouse C" << endl;
        } else if(B < A) {
            cout << "Cat B" << endl;
        } else if(A < B) {
            cout << "Cat A" << endl;
        }
    }
    return 0;
}
