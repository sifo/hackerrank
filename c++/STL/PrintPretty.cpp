#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int T; cin >> T;
    cout << setiosflags(ios::uppercase);
    cout << setw(0xf) << internal;
    while(T--) {
        double A; cin >> A;
        double B; cin >> B;
        double C; cin >> C;
        cout << setw(0) << hex << nouppercase << showbase << (long long) A << dec << endl;
        cout << setfill('_') << setw(15) << right << fixed << setprecision(2) << showpos << B << noshowpos << endl;
        cout << uppercase << setprecision(9) << scientific << C << endl;
    }
    return 0;

}
