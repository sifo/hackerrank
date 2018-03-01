# https://www.hackerrank.com/challenges/np-array-mathematics/problem

import numpy

if __name__ == '__main__':
    n, m = map(int, input().split())
    a = numpy.array([list(map(int, input().split())) for _ in range(n)])
    b = numpy.array([list(map(int, input().split())) for _ in range(n)])
    print(a + b)
    print(a - b)
    print(a * b)
    print(a // b)
    print(a % b)
    print(a ** b)
