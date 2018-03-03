# https://www.hackerrank.com/challenges/np-polynomials/problem

import numpy

if __name__ == '__main__':
    P = map(float, input().split())
    print(numpy.polyval(list(P), float(input())))
