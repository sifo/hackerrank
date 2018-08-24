#include <stdio.h>
#include <stdlib.h>

int greatest(int a, int b, int c, int d) {
    int m = a;
    if(b > m) m = b;
    if(c > m) m = c;
    if(d > m) m = d;
    return m;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    printf("%d\n", greatest(a, b, c, d));
    return 0;
}
