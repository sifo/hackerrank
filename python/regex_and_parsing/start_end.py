# https://www.hackerrank.com/challenges/re-start-re-end/problem

import re

if __name__ == '__main__':
    s = input()
    k = input()
    r = re.search(k, s)
    i = 0
    while r:
        print('({}, {})'.format(r.start()+i, r.end()-1+i))
        i = i + r.start() + 1
        s = s[r.start()+1:]
        r = re.search(k, s)
    if i == 0:
        print((-1, -1))
