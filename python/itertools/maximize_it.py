# https://www.hackerrank.com/challenges/maximize-it/problem

import itertools

if __name__ == '__main__':
    K, M = map(int, input().split())
    l = []
    for i in range(K):
        l.append([int(x)**2 for x in input().split()[1:]])
    l = itertools.product(*l)
    l = [sum(x)%M for x in l]
    print(max(l))
