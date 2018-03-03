# https://www.hackerrank.com/challenges/np-linear-algebra/problem

import numpy

if __name__ == '__main__':
    A = [list(map(float, input().split())) for _ in range(int(input()))]
    print(numpy.linalg.det(A))
