// https://www.hackerrank.com/challenges/insertionsort1/problem

#include <iostream>
using namespace std;

int main() {
    int Size;
    cin >> Size;
    int t[Size];
    for(int i = 0; i < Size; i++) {
        cin >> t[i];
    }

    int i = Size-2;
    int key = t[Size-1];
    while(t[i] > key) {
        t[i+1] = t[i];
        i--;
        for(int i = 0; i < Size; i++) {
            cout << t[i] << " ";
        }
        cout << endl;
    }
    t[i+1] = key;
    for(int i = 0; i < Size; i++) {
        cout << t[i] << " ";
    }
    cout << endl;
}
