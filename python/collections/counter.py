# https://www.hackerrank.com/challenges/collections-counter/problem

import collections

if __name__ == '__main__':
    input()
    c = collections.Counter(list(map(int, input().split())))
    res = 0
    for i in range(int(input())):
        x, s = list(map(int, input().split()))
        if c[x] > 0:
            res += s
            c[x] -= 1
    print(res)
