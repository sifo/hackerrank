/*
  https://www.hackerrank.com/challenges/gridland-metro/problem
 */

#include <iostream>
#include <vector>
using namespace std;

struct Track {
    long long int r, c1, c2;
};

int main() {
    long long int n, m, cover = 0;
    int k;
    cin >> n >> m >> k;
    vector<Track> tracks;
    for(int i = 0; i < k; i++) {
        Track cur;
        cin >> cur.r >> cur.c1 >> cur.c2;
        bool ok = true;
        for(unsigned i = 0; i < tracks.size(); i++) {
            Track t = tracks.at(i);
            if(t.r == cur.r) {
                if(cur.c1 <= t.c1 && cur.c2 >= t.c2) {
                    cover -= t.c2 - t.c1 + 1;
                    tracks.erase(tracks.begin() + i);
                    i--;
                } else if(cur.c1 >= t.c1 && cur.c2 <= t.c2) {
                    ok = false;
                    break;
                } else if(cur.c1 <= t.c1 && cur.c2 >= t.c1 && cur.c2 <= t.c2) {
                    cur.c2 = t.c1-1;
                } else if(cur.c1 <= t.c2 && cur.c2 >= t.c2 && cur.c1 >= t.c1) {
                    cur.c1 = t.c2+1;
                }
            }
        }
        if(ok && cur.c2 >= cur.c1) {
            tracks.push_back(cur);
            cover += cur.c2 - cur.c1 + 1;
        }
    }
    cout << (n*m)-cover << endl;
    return 0;
}
