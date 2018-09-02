#include <iostream>
using namespace std;

int main() {
    int n, a;
    cin >> n;
    int t[99] = { 0 };
    for(int i = 0; i < n; i++) {
        cin >> a;
        t[--a]++;
    }
    int res = 0;
    for(int i = 0; i < n-1; i++) {
        if(t[i]+t[i+1] > res)
            res = t[i]+t[i+1];
    }
    cout << res << endl;
    return 0;
}
