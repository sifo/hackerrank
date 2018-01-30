# https://www.hackerrank.com/challenges/itertools-permutations/problem

import itertools

if __name__ == '__main__':
    S, k = input().split()
    l = [''.join(i) for i in itertools.permutations(list(S), int(k))]
    l.sort()
    for i in l:
        print(i)
