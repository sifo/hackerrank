# https://www.hackerrank.com/challenges/iterables-and-iterators/problem

from itertools import combinations

if __name__ == '__main__':
    N = int(input())
    l = input().split()
    K = int(input())
    l = list(combinations(l, K))
    l2 = [i for i in l if 'a' in i]
    print(len(l2)/len(l))
