/*
  https://www.hackerrank.com/challenges/sherlock-and-array/problem
*/

#include <iostream>
using namespace std;

int main() {
    int T, n;
    cin >> T;
    for(int i = 0; i < T; i++) {
        cin >> n;
        int A[n];
        for(int j = 0; j < n; j++) {
            cin >> A[j];
        }

        int sum_before[n] = { 0 };
        int sum_after[n] = { 0 };
        for(int j = 1; j < n; j++) {
            sum_before[j] = A[j-1] + sum_before[j-1];
        }
        for(int j = n-2; j >= 0; j--) {
            sum_after[j] = A[j+1] + sum_after[j+1];
        }

        bool found = false;
        for(int j = 0; j < n; j++) {
            if(sum_before[j] == sum_after[j]) {
                found = true;
                break;
            }
        }
        if(found) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
}
