// https://www.hackerrank.com/challenges/playing-with-characters/problem

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define MAX_LEN 512

int main() {
		char c;
		char s[MAX_LEN];
		char sen[MAX_LEN];
		scanf("%c", &c);
		scanf("%s", &s);
		scanf("\n");
		scanf("%[^\n]%*c", &sen);
		printf("%c\n", c);
		printf("%s\n", s);
		printf("%s\n", sen);
		return 0;
}
