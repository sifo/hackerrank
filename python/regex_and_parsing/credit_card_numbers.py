# https://www.hackerrank.com/challenges/validating-credit-card-number/problem

import re

if __name__ == '__main__':
    for _ in range(int(input())):
        c = input()
        try:
            assert re.match(r'^([456][0-9]{15})|([456][0-9]{3}-[0-9]{4}-[0-9]{4}-[0-9]{4})$', c)
            assert not re.match(r'^.*(.)\1{3}.*$', ''.join(c.split('-')))
        except:
            print('Invalid')
        else:
            print('Valid')
