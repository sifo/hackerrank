# https://www.hackerrank.com/challenges/np-sum-and-prod/problem

import numpy

if __name__ == '__main__':
    n, _ = input().split()
    l = [ list(map(int, input().split())) for _ in range(int(n))]
    a = numpy.array(l)
    s = numpy.sum(a, axis=0)
    print(numpy.prod(s))
