/*
  https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem

  Use BFS.
*/

#include <iostream>
#include <list>
#include <algorithm>
using namespace std;

struct Position {
    int x, y;
};

bool in_matrix(int n, int m, Position p) {
    return p.x < n && p.y < m && p.x >= 0 && p.y >= 0;
}

int region_size(int t[], bool visited[], int i, int j, int n, int m) {
    Position c = {i, j};
    visited[c.x*m+c.y] = true;
    list<Position> queue;
    queue.push_back(c);
    int res = 1;

    while(!queue.empty()) {
        c = queue.front();
        queue.pop_front();
        list<Position> adj;
        adj.push_back({ c.x+1, c.y+1 });
        adj.push_back({ c.x-1, c.y+1 });
        adj.push_back({ c.x+1, c.y-1 });
        adj.push_back({ c.x-1, c.y-1 });
        adj.push_back({ c.x+1, c.y   });
        adj.push_back({ c.x,   c.y+1 });
        adj.push_back({ c.x-1, c.y   });
        adj.push_back({ c.x,   c.y-1 });
        for(auto p: adj) {
            if(in_matrix(n, m, p) && t[p.x*m+p.y] == 1 && !visited[p.x*m+p.y]) {
                visited[p.x*m+p.y] = true;
                queue.push_back(p);
                res++;
            }
        }
    }

    return res;
}

int main() {
    int n, m;
    cin >> n >> m;
    int t[n*m] = { 0 };
    bool visited[n*m] = { false };
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> t[i*m+j];
        }
    }
    int res = 0;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            if(t[i*m+j] == 1 && !visited[i*m+j]) {
                int tmp = region_size(t, visited, i, j, n, m);
                if(tmp > res)
                    res = tmp;
            }
        }
    }
    cout << res << endl;
}
