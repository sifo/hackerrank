# https://www.hackerrank.com/challenges/np-dot-and-cross/problem

import numpy

if __name__ == '__main__':
    n = int(input())
    a = [list(map(int, input().split())) for _ in range(n)]
    b = [list(map(int, input().split())) for _ in range(n)]
    a = numpy.array(a)
    b = numpy.array(b)
    print(numpy.dot(a,b))
