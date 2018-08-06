// https://www.hackerrank.com/challenges/torque-and-development/problem

// DFS example: https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/

#include<iostream>
#include<list>
using namespace std;

class Graph {
    list<int> *adj;
    long DFSUtil(int v, bool visited[]);

public:
    int V;
    Graph(int V);
    void addEdge(int v, int w);
    long DFS(int v, long croad, long clib);
};

Graph::Graph(int V) {
    this->V = V;
    adj = new list<int>[V];
}

void Graph::addEdge(int v, int w) {
    adj[--v].push_back(--w);
}

long Graph::DFSUtil(int v, bool visited[]) {
    long calls = 0;
    visited[v] = true;
    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i]) {
            calls = calls + 1 + DFSUtil(*i, visited);
        }
    return calls;
}

long Graph::DFS(int v, long clib, long croad) {
    long res = 0;
    long circuits = 0;

    bool *visited = new bool[V];
    for (int i = 0; i < V; i++)
        visited[i] = false;

    for (int i = 0; i < V; i++)
        if (visited[i] == false) {
            circuits++;
            res += DFSUtil(i, visited);
        }
    return circuits*clib+res*croad;
}

long cost(Graph g, long clib, long croad) {
    if (clib <= croad){
        return clib*g.V;
    }
    return g.DFS(0, clib, croad);
}

int main() {
    int q;
    cin >> q;
    while(q-- > 0) {
        int n, m; long clib, croad;
        cin >> n >> m >> clib >> croad;
        Graph g(n);
        while(m-- > 0) {
            int a, b;
            cin >> a >> b;
            g.addEdge(a, b);
            g.addEdge(b, a);
        }
        cout << to_string(cost(g, clib, croad)) << endl;
    }
    return 0;
}
