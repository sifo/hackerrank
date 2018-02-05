# https://www.hackerrank.com/challenges/word-order/problem

from collections import OrderedDict

if __name__ == '__main__':
    d = OrderedDict()
    for i in range(int(input())):
        w = input()
        if w not in d:
            d[w] = 1
        else:
            d[w] += 1
    print(len(d))
    print(*list(d.values()))
