# https://www.hackerrank.com/challenges/incorrect-regex/problem

import re

if __name__ == '__main__':
    for _ in range(int(input())):
        try:
            re.compile(input())
        except re.error:
            print(False)
        else:
            print(True)
