#  https://www.hackerrank.com/challenges/compress-the-string/problem

import itertools

if __name__ == '__main__':
    l = map(int, list(input()))
    print(*[(len(list(g)), k) for k, g in itertools.groupby(l, lambda x: x)])
