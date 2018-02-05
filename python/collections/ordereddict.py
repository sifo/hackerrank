# https://www.hackerrank.com/challenges/py-collections-ordereddict/problem

from collections import OrderedDict

if __name__ == '__main__':
    d = OrderedDict()
    for i in range(int(input())):
        *n, p = input().split()
        n = ' '.join(n)
        p = int(p)
        if n not in d:
            d[n] = p
        else:
            d[n] = d[n] + p

    for i in d:
        print('{} {}'.format(i, d[i]))
