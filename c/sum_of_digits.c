// https://www.hackerrank.com/challenges/sum-of-digits-of-a-five-digit-number/problem

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int res = 0;
    while(n > 0) {
        res += n%10;
        n /= 10;
    }
    printf("%d\n", res);
    return 0;
}
