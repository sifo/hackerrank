// https://www.hackerrank.com/challenges/drawing-book/problem

#include <iostream>
using namespace std;

int main() {
    int n, p;
    cin >> n >> p;
    int front = p / 2;

    // We pretend here that we're starting from the front of the book. So we need to change p.
    // if n = 6 and p = 5. So that would be equivalent to p = 2 if we start from the beginning.
    // Because in both cases we need to flip one time to go to the target page.
    // Although, if n = 5 and p = 4, that would be equivalent to p = 1 from the beginning. So we
    // need to check if n is even or not.
    p = n - p + (n % 2 == 0 ? 1 : 0);

    int back = p / 2;
    cout << (front < back ? front : back) << endl;
    return 0;
}
