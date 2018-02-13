# https://www.hackerrank.com/challenges/validate-list-of-email-address-with-filter/problem

import re

if __name__ == '__main__':
    emails = [input() for _ in range(int(input()))]
    emails  = filter(lambda x: re.match( r'^[a-z0-9_\-]+@[a-z0-9]+\.[a-z]{1,3}$', x.lower()), emails)
    print(sorted(emails))
