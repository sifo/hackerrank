# https://www.hackerrank.com/challenges/hex-color-code/problem

import re

if __name__ == '__main__':
    for _ in range(int(input())):
        r = re.findall(r'.+?(#[0-9a-fA-F]{6}|#[0-9a-fA-F]{3})', input())
        if len(r) > 0:
            print(*r , sep='\n')
