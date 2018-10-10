#include <cstdio>
#include <cmath>
#include <iostream>
#include <limits>

using namespace std;
int main() {
    int a [8][3][3] = {
        {
            {8, 3, 4},
            {1, 5, 9},
            {6, 7, 2}
        },
        {
            {6, 1, 8},
            {7, 5, 3},
            {2, 9, 4}
        },
        {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        },
        {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        },
        {
            {6, 7, 2},
            {1, 5, 9},
            {8, 3, 4}
        },
        {
            {2, 9, 4},
            {7, 5, 3},
            {6, 1, 8}
        },
        {
            {4, 3, 8},
            {9, 5, 1},
            {2, 7, 6}
        },
        {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        }
    };
    int t[3][3];
    for(int i = 0; i < 3; i++)
        for(int j = 0; j < 3; j++)
            cin >> t[i][j];

    int res = std::numeric_limits<int>::max();
    for(int k = 0; k < 8; k++) {
        int m = 0;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                m += abs(t[i][j] - a[k][i][j]);
        if(m < res)
            res = m;
    }
    cout << res << endl;
    return 0;
}
