// https://www.hackerrank.com/challenges/insertionsort2/problem

#include <iostream>
using namespace std;

void print(int t[], int n) {
    for(int i = 0; i < n; i++) {
        cout << t[i] << " ";
    }
    cout << endl;
}

int main() {
    int s;
    cin >> s;
    int t[s];
    for(int i = 0; i < s; i++) {
        cin >> t[i];
    }
    for(int i = 1; i < s; i++) {
        int key = t[i];
        int j = i - 1;
        while(j >= 0 && t[j] > key) {
            t[j+1] = t[j];
            j--;
        }
        t[j+1] = key;
        print(t, s);
    }
}
