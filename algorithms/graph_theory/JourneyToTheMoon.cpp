// https://www.hackerrank.com/challenges/journey-to-the-moon/problem

// DFS example: https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/

#include <iostream>
#include <list>
using namespace std;

class Graph {
    int V;
    list<int> *adj;
    long DFSUtil(int v, bool visited[]);
public:
    Graph(int V);
    void addEdge(int v, int w);
    long DFS(int v);
};

Graph::Graph(int V) {
    this->V = V;
    adj = new list<int>[V];
}

void Graph::addEdge(int v, int w) {
    adj[v].push_back(w);
}

long Graph::DFSUtil(int v, bool visited[]) {
    visited[v] = true;

    long c = 0;

    list<int>::iterator i;
    for(i = adj[v].begin(); i != adj[v].end(); ++i)
        if(!visited[*i]) {
            c = c + 1 + DFSUtil(*i, visited);
        }
    return c;
}

long Graph::DFS(int v) {
    long res = 0;

    bool *visited = new bool[V];
    for (int i = 0; i < V; i++)
        visited[i] = false;

    for (int i = 0; i < V; i++) {
        if (visited[i] == false) {
            long d = DFSUtil(i, visited);
            res += (d+1)*(V - (d + 1));
        }
    }

    return res/2;
}

long pairsFromDifferentCountries(Graph g) {
    return g.DFS(0);
}

int main() {
    int n, p;
    cin >> n >> p;
    Graph g(n);
    while(p-- > 0) {
        int a, b;
        cin >> a >> b;
        g.addEdge(a, b);
        g.addEdge(b, a);
    }
    cout << pairsFromDifferentCountries(g) << endl;
    return 0;
}
