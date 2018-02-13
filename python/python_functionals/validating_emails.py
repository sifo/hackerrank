# https://www.hackerrank.com/challenges/validate-list-of-email-address-with-filter/problem

import re

if __name__ == '__main__':
    emails = [input() for _ in range(int(input()))]
    emails  = filter(lambda x: re.match( r'^[a-zA-Z0-9_\-]+@[a-zA-Z0-9]+\.[a-zA-Z]{1,3}$',x), emails)
    print(sorted(emails))
