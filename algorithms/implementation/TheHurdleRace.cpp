#include <iostream>
using namespace std;

int main() {
    int n, k, max = 0, e = 0;
    cin >> n >> k;
    while(n-- > 0) {
        cin >> e;
        if(e > max) max = e;
    }
    cout << (max > k ? max-k : 0) << endl;
    return 0;
}
