# https://www.hackerrank.com/challenges/validating-the-phone-number/problem

import re

if __name__ == '__main__':
    for _ in range(int(input())):
        e = input()
        if re.match(r'^[a-z]+ \<[a-z0-9][a-z0-9_\-\.]+@[a-z]+\.[a-z]{1,3}\>$', e.lower()):
            print(e)
