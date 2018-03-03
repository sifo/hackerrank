# https://www.hackerrank.com/challenges/np-inner-and-outer/problem

import numpy

if __name__ == '__main__':
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    A = numpy.array(A)
    B = numpy.array(B)
    print(numpy.inner(A, B))
    print(numpy.outer(A, B))
