# https://www.hackerrank.com/challenges/defaultdict-tutorial/problem

from collections import defaultdict

if __name__ == '__main__':
    n, m = list(map(int, input().split()))
    d = defaultdict(list)
    for i in range(n):
        d[input()].append(i+1)
    for _ in range(m):
        i = input()
        if d[i]:
            print(*d[i])
        else:
            print(-1)
