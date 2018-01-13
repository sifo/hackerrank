/*
  https://www.hackerrank.com/challenges/knightl-on-chessboard/problem

  Use BFS and do not mark visited squares with an array of booleans but with the
  number of steps to get to the squares.

  help:
  https://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/
*/

#include <iostream>
#include <list>
#include <algorithm>
using namespace std;

struct Position {
    int x, y;
};

bool in_board(int n, Position p) {
    return p.x < n && p.y < n && p.x >= 0 && p.y >= 0;
}

int steps_required(int n, int a, int b) {
    Position c = {0, 0};
    int visited[n*n];
    fill_n(visited, n*n, -1);
    visited[c.x*n+c.y] = 0;
    list<Position> queue;
    queue.push_back(c);

    while(!queue.empty()) {
        c = queue.front();
        queue.pop_front();
        list<Position> adj;
        adj.push_back({ c.x+a, c.y+b });
        adj.push_back({ c.x-a, c.y+b });
        adj.push_back({ c.x+a, c.y-b });
        adj.push_back({ c.x-a, c.y-b });
        adj.push_back({ c.x+b, c.y+a });
        adj.push_back({ c.x-b, c.y+a });
        adj.push_back({ c.x+b, c.y-a });
        adj.push_back({ c.x-b, c.y-a });
        for(auto p: adj) {
            if(in_board(n,p) && visited[p.x*n+p.y] == -1) {
                visited[p.x*n+p.y] = visited[c.x*n+c.y] + 1;
                queue.push_back(p);
            }
        }
    }

    return visited[n*n-1];
}

int main() {
    int n;
    cin >> n;
    for(int a = 1; a < n; a++) {
        for(int b = 1; b < n; b++) {
            cout << steps_required(n, a, b) << " ";
        }
        cout << endl;
    }
}
