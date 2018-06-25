// https://www.hackerrank.com/challenges/variable-sized-arrays/problem

#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, q;
    cin >> n >> q;
    vector<int> t[n];
    for(int i = 0; i < n; i++) {
        int size;
        cin >> size;
        for(int j = 0; j < size; j++) {
            int e;
            cin >> e;
            t[i].push_back(e);
        }
    }
    while(q-- > 0) {
        int i, j;
        cin >> i >> j;
        cout << t[i].at(j) << endl;
    }
    return 0;
}
