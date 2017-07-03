#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int diagonal_difference(int m[], int n) {
	int d1 = 0, d2 = 0;
	for(int i = 0, j = 0; i < n; i++, j++) {
		d1 += m[(i*n)+j];
	}
	for(int i = 0, j = n-1; i < n; i++, j--) {
		d2 += m[(i*n)+j];
	}
	return abs(d1-d2);
}

int main() {
	int n;
	cin >> n;
	int m[n*n];
	for(int i = 0; i < n*n; i++) {
		cin >> m[i];
	}
	cout << diagonal_difference(m, n) << endl;
	return 0;
}
