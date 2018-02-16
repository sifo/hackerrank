# https://www.hackerrank.com/challenges/re-findall-re-finditer/problem

import re

if __name__ == '__main__':
    l = re.findall(r'(?<=[qwrtypsdfghjklzxcvbnm])([aeiou]{2,})[qwrtypsdfghjklzxcvbnm]', input(), re.IGNORECASE)
    if len(l) > 0:
        print(*l, sep='\n')
    else:
        print(-1)
