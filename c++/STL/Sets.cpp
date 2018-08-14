// https://www.hackerrank.com/challenges/cpp-sets/problem

#include <iostream>
#include <set>
using namespace std;


int main() {
    int Q, x, y;
    cin >> Q;
    set<int> s;
    while(Q-- > 0) {
        cin >> x >> y;
        switch(x) {
        case 1: s.insert(y); break;
        case 2: s.erase(y); break;
        case 3: string r = s.find(y) != s.end() ? "Yes" : "No"; cout << r << endl; break;
        }
    }
    return 0;
}
