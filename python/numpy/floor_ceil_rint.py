# https://www.hackerrank.com/challenges/floor-ceil-and-rint/problem

import numpy

if __name__ == '__main__':
    l = list(map(float, input().split()))
    a = numpy.array(l)
    print(numpy.floor(a))
    print(numpy.ceil(a))
    print(numpy.rint(a))
