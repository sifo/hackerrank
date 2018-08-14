// https://www.hackerrank.com/challenges/vector-sort/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, e;
    cin >> n;
    vector<int> v;
    while(n-- > 0) {
        cin >> e;
        v.push_back(e);
    }
    sort(v.begin(), v.end());
    for(auto i: v) {
        cout << i << " ";
    }
    cout << endl;
    return 0;
}
