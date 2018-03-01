# https://www.hackerrank.com/challenges/np-zeros-and-ones/problem

import numpy

if __name__ == '__main__':
    d = tuple(map(int, input().split()))
    print(numpy.zeros(d, dtype = numpy.int))
    print(numpy.ones(d, dtype = numpy.int))
