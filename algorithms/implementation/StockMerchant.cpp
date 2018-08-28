// https://www.hackerrank.com/challenges/sock-merchant/problem

#include <iostream>
using namespace std;

int main() {
    int n, e, res = 0;
    cin >> n;
    int t[100] = { 0 };
    for(int i = 0; i < n; i++) {
        cin >> e;
        t[--e]++;
    }
    for(int i = 0; i < 100; i++) {
        res += t[i]/2;
    }
    cout << res << endl;
    return 0;
}
