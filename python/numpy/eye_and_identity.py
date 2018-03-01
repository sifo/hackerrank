# https://www.hackerrank.com/challenges/np-eye-and-identity/problem

import numpy

if __name__ == '__main__':
    n, m = map(int, input().split())
    print(numpy.eye(n, m, k=0))
