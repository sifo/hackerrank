# https://www.hackerrank.com/challenges/validating-postalcode/problem

import re

c = input()
print(bool(re.match(r'^[1-9][0-9]{5}$', c) and len(re.findall(r'(.)(?=.\1)', c)) <= 1))
