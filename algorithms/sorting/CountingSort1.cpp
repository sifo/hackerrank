#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int n, cur;
    cin >> n;
    int t[100] = { 0 };
    for(int i = 0; i < n; i++) {
        cin >> cur;
        if(cur < 100)
            t[cur]++;
    }
    for(int i = 0; i < 100; i++)
        cout << t[i] << " ";
    cout << endl;
    return 0;
}
