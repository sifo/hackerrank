# https://www.hackerrank.com/challenges/matrix-script/problem

import re

n, _ = input().split()
l = [list(input()) for _ in range(int(n))]
l = [''.join(i) for i in zip(*l)]
l = ''.join(l)
# p = r'(?<=[a-zA-Z0-9])[\s\!\@\#\$\%\&]+(?=[a-zA-Z0-9])'
p = r'(?<=\w)[^\w]+(?=\w)'
print(re.sub(p, ' ', l))
