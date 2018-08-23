// https://www.hackerrank.com/challenges/preprocessor-solution/problem
//
// Note: do it in without macro first, then replace with macro

/*
#include <iostream>
#include <vector>
#include <limits>
using namespace std;
#define toStr(s) #s

inline void minimum(int &min, int c) {
    if(c < min)
        min = c;
}

inline void maximum(int &max, int c) {
    if(c > max)
        max = c;
}

int main(){
	int n;
  cin >> n;
	vector<int> v(n);
	for(int i = 0; i < v.size(); i++) {
      cin >> v[i];
	}
	int mn = std::numeric_limits<int>::max();
	int mx = -std::numeric_limits<int>::max();
	for(int i = 0; i < v.size(); i++) {
		minimum(mn, v[i]);
		maximum(mx, v[i]);
	}
	int ans = mx - mn;
	cout << toStr(Result =) <<' '<< ans;
	return 0;
}
*/

#include <limits>
#define INF std::numeric_limits<int>::max()
#define toStr(s) #s
#define io(v) cin >> v
#define foreach(v, i) for(int i = 0; i < v.size(); i++)
#define FUNCTION(f,o) inline void f(int &n, int c) { if(c o n) n = c;}

#include <iostream>
#include <vector>
using namespace std;

#if !defined toStr || !defined io || !defined FUNCTION || !defined INF
#error Missing preprocessor definitions
#endif

FUNCTION(minimum, <)
FUNCTION(maximum, >)

int main(){
	int n; cin >> n;
	vector<int> v(n);
	foreach(v, i) {
		io(v)[i];
	}
	int mn = INF;
	int mx = -INF;
	foreach(v, i) {
		minimum(mn, v[i]);
		maximum(mx, v[i]);
	}
	int ans = mx - mn;
	cout << toStr(Result =) <<' '<< ans;
	return 0;

}
