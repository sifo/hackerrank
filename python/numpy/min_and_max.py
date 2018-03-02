# https://www.hackerrank.com/challenges/np-min-and-max/problem

import numpy

if __name__ == '__main__':
    n, _ = input().split()
    l = [ list(map(int, input().split())) for _ in range(int(n))]
    a = numpy.array(l)
    s = numpy.min(a, axis=1)
    print(numpy.max(s))
