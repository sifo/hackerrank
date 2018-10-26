#include <stdio.h>
#include <stdlib.h>

int main() {
    int a, b;
    char *t[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    scanf("%d\n%d", &a, &b);
    for(int i = a; i <= b; i++) {
        printf("%s\n", i <= 9 ? t[i-1] : (i % 2 == 0 ? "even" : "odd"));
    }
    return 0;
}
