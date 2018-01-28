# https://www.hackerrank.com/challenges/polar-coordinates/problem

import cmath

if __name__ == '__main__':
    c = complex(input())
    print(abs(c))
    print(cmath.phase(c))
