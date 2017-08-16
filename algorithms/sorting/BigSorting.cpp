#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool strictly_greater(string b, string a) {
    if(a.size() > b.size()) {
        return true;
    } else if(a.size() < b.size()) {
        return false;
    }
    for(int i = 0; i < (signed)a.size(); i++) {
        if(a[i] > b[i]) {
            return true;
        } else if (a[i] < b[i]) {
            return false;
        }
    }
    return false;
}

int main() {
    int n;
    cin >> n;
    vector<string> t(n);
    for(int i = 0; i < n; i++) {
        cin >> t[i];
    }
    sort(t.begin(), t.end(), strictly_greater);
    /* too slow
    for(int i = 1; i < n; i++) {
        string key = t[i];
        int j = i - 1;
        while(j >= 0 && strictly_greater(key, t[j])) {
            t[j+1] = t[j];;
            j = j - 1;
        }
        t[j+1] = key;
    }
    */
    for(int i = 0; i < n; i++) {
        cout << t[i] << endl;
    }
}
