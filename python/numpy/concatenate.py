# https://www.hackerrank.com/challenges/np-concatenate/problem

import numpy

if __name__ == '__main__':
    n, m, _ = map(int, input().split())
    N = [list(map(int, input().split())) for _ in range(n)]
    M = [list(map(int, input().split())) for _ in range(m)]
    N = numpy.array(N)
    M = numpy.array(M)
    print(numpy.concatenate((N, M), axis = 0))
