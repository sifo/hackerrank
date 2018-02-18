# https://www.hackerrank.com/challenges/re-sub-regex-substitution/problem

import re

def f(m):
    if m.group(0) == '&& ':
        return 'and '
    return 'or '

if __name__ == '__main__':
    for i in range(int(input())):
        s = input()
        p = r'(?:(?<= )&& |(?<= )\|\| )'
        print(re.sub(p, f, s))
