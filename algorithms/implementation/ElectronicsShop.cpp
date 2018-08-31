// https://www.hackerrank.com/challenges/electronics-shop/problem

#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n, m, b;
    cin >> b >> n >> m;
    int N[n];
    int M[m];
    for(int i = 0; i < n; i++) cin >> N[i];
    for(int i = 0; i < m; i++) cin >> M[i];
    sort(N, N+n);
    sort(M, M+m);
    int max = -1;
    int s;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            if(N[i] >= b) goto finish;
            if(M[j] >= b) break;

            s = N[i] + M[j];
            if(s > b) break;
            if(s == b) { max = s; goto finish; }
            if(s > max) max = s;
        }
    }
 finish:
    cout << max << endl;
    return 0;
}
