# https://www.hackerrank.com/challenges/np-zeros-and-ones/problem

import numpy

if __name__ == '__main__':
    d = list(map(int, input().split()))
    print(numpy.zeros(tuple(d), dtype = numpy.int))
    print(numpy.ones(tuple(d), dtype = numpy.int))
