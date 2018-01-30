# https://www.hackerrank.com/challenges/itertools-combinations-with-replacement/problem

import itertools

if __name__ == '__main__':
    S, k = input().split()
    for i in itertools.combinations_with_replacement(sorted(S), int(k)):
        print(''.join(i))
