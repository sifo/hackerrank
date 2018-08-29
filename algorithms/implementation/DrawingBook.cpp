// https://www.hackerrank.com/challenges/drawing-book/problem

#include <iostream>
using namespace std;

int main() {
    int n, p;
    cin >> n >> p;
    int front = p / 2;
    p = n - p + (n % 2 == 0 ? 1 : 0);
    int back = p / 2;
    cout << (front < back ? front : back) << endl;
    return 0;
}
