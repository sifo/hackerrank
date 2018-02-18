# https://www.hackerrank.com/challenges/validating-the-phone-number/problem

import re

if __name__ == '__main__':
    for _ in range(int(input())):
        print('YES' if re.search(r'^[7-9]\d{9}$', input()) else 'NO')
