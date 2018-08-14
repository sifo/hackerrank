// https://www.hackerrank.com/challenges/vector-erase/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, e, a, b, c;
    cin >> n;
    vector<int> v;
    while(n-- > 0) {
        cin >> e;
        v.push_back(e);
    }

    cin >> a;
    v.erase(v.begin()+a-1);

    cin >> b >> c;
    v.erase(v.begin()+b-1, v.begin()+c-1);

    cout << v.size() << endl;
    for(auto i: v) {
        cout << i << " ";
    }
    cout << endl;
    return 0;
}
