# https://www.hackerrank.com/challenges/np-mean-var-and-std/problem

import numpy

if __name__ == '__main__':
    n, _ = input().split()
    l = [list(map(int, input().split())) for _ in range(int(n))]
    a = numpy.array(l)
    print(numpy.mean(a, axis=1))
    print(numpy.var(a, axis=0))
    print(numpy.std(a))
