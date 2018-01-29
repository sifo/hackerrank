// https://www.hackerrank.com/challenges/countingsort4/problem

#include <iostream>
#include <cstdio>
#include <vector>
#include <tuple>
using namespace std;

int main() {
    int n, cur;
    string s;
    cin >> n;
    vector<string> t[100];
    for(int i = 0; i < n; i++) {
        cin >> cur;
        cin >> s;
        if(i < n/2) {
            s = "-";
        }
        if(cur < 100) {
            t[cur].push_back(s);
        }
    }
    for(int i = 0; i < 100; i++) {
        for(unsigned j = 0; j < t[i].size(); j++) {
            cout << t[i].at(j) << " ";
        }
    }
    cout << endl;
    return 0;
}
