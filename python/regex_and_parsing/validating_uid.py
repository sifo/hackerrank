# https://www.hackerrank.com/challenges/validating-uid/problem

import re

if __name__ == '__main__':
    for _ in range(int(input())):
        s = input()
        a = re.match(r'^[a-zA-Z0-9]{10}$', s)
        b = re.search(r'[A-Z].*?[A-Z]', s)
        c = re.search(r'\d.*?\d.*?\d', s)
        d = re.match(r'^.*(.).*\1.*$', s)
        print('Valid' if a and b and c and not d else 'Invalid')
