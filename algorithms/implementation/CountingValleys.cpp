#include <iostream>
using namespace std;

int main() {
    int n, t = 0, res = 0;
    string s;
    cin >> n >> s;
    for(int i = 0; i < n; i++) {
        switch(s[i]) {
        case 'D': t--; break;
        case 'U': t++; if(t == 0) res++; break;
        }
    }
    cout << res << endl;
    return 0;
}
