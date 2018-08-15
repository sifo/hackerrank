// https://www.hackerrank.com/challenges/cpp-lower-bound/problem

#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, Q, Y;
    cin >> N;
    vector<int> v(N);
    for(int i = 0; i < v.size(); i++) {
        cin >> v[i];
    }
    cin >> Q;
    while(Q-- > 0) {
        cin >> Y;
        vector<int>::iterator low = std::lower_bound(v.begin(), v.end(), Y);
        int i = low-v.begin();
        string r = i < v.size() && v[i] == Y ? "Yes" : "No";
        cout << r << " " << (i+1) << endl;
    }
    return 0;
}
