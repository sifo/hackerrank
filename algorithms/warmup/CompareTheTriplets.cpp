#include <cstdio>
#include <iostream>
using namespace std;

int main() {
	int a0, a1, a2, b0, b1, b2;
	int sa = 0, sb = 0;
	cin >> a0;
	cin >> a1;
	cin >> a2;
	cin >> b0;
	cin >> b1;
	cin >> b2;
	if(a0 > b0) sa++; else if (a0 < b0) sb++;
	if(a1 > b1) sa++; else if (a1 < b1) sb++;
	if(a2 > b2) sa++; else if (a2 < b2) sb++;
	cout << sa << " " << sb << endl;
	return 0;
}
