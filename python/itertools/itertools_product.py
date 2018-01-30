# https://www.hackerrank.com/challenges/itertools-product/problem

import itertools

if __name__ == '__main__':
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    for i in itertools.product(A, B):
        print(i, end=' ')
    print()
