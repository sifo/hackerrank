#include <iostream>
using namespace std;

int main() {
    int a;
    int b;
    cin >> a >> b;
    string s = "";
    for(int i = a; i <= b; i++) {
        switch(i) {
        case 1: s = "one"; break;
        case 2: s = "two"; break;
        case 3: s = "three"; break;
        case 4: s = "four"; break;
        case 5: s = "five"; break;
        case 6: s = "six"; break;
        case 7: s = "seven"; break;
        case 8: s = "eight"; break;
        case 9: s = "nine"; break;
        default: s = (i%2 == 0) ? "even" : "odd";
        }
        cout << s << endl;
    }
    return 0;
}
