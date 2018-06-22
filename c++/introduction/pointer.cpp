// https://www.hackerrank.com/challenges/c-tutorial-pointer/problem

#include <stdio.h>

void update(int *a,int *b) {
    int tmp = *b;
    *b = *a > *b ? *a - *b : *b - *a;
    *a = *a + tmp;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d\n", a, b);

    return 0;
}
